package viceCity.models.guns;

import static viceCity.common.ExceptionMessages.*;

public abstract class BaseGun implements Gun{
    private String name;
    private int bulletsPerBarrel;
    private int totalBullets;
    private boolean canFire;

    protected BaseGun(String name, int bulletsPerBarrel, int totalBullets) {
        this.setName(name);
        this.setBulletsPerBarrel(bulletsPerBarrel);
        this.setTotalBullets(totalBullets);
        this.canFire = true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(NAME_NULL);
        }
        this.name = name;
    }

    @Override
    public int getBulletsPerBarrel() {
        return this.bulletsPerBarrel;
    }

    protected void setBulletsPerBarrel(int bulletsPerBarrel) {
        if(this.bulletsPerBarrel < 0){
            throw new IllegalArgumentException(BULLETS_LESS_THAN_ZERO);
        }
        this.bulletsPerBarrel = bulletsPerBarrel;
    }

    @Override
    public boolean canFire() {
        return this.totalBullets > 0 || this.bulletsPerBarrel >0;
    }

    @Override
    public int getTotalBullets() {
        return this.totalBullets;
    }

    protected void setTotalBullets(int totalBullets) {
        if(this.totalBullets < 0){
            throw new IllegalArgumentException(TOTAL_BULLETS_LESS_THAN_ZERO);
        }
        this.totalBullets = totalBullets;
    }

    @Override
    public int fire() {
        return 0;
    }


}
