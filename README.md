# Getting started



## WIKI
_**Table of contents:**_
* [Clan creation](https://github.com/Hempfest/Clans/wiki/Creating-a-clan.)
* [Clan leaving/disbanding](https://github.com/Hempfest/Clans/wiki/Leaving-a-clan.)
* [Clan rank management](https://github.com/Hempfest/Clans/wiki/Clan-rank-management.)
* [Claiming & Raid Shield](https://github.com/Hempfest/Clans/wiki/Claiming-&-Raid-Shield)
* [Clan Power](https://github.com/Hempfest/Clans/wiki/Clan-Power)



## Developers
**Importing** w/ the pom.xml
```
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.Hempfest</groupId>
    <artifactId>Clans</artifactId>
    <version>-290a2bcb48-1</version>
    <scope>provided</scope>
</dependency>
<dependency>
    <groupId>com.github.Hempfest</groupId>
    <artifactId>HempCore</artifactId>
    <version>96915fddcf</version>
    <scope>provided</scope>
</dependency>
```
**Event List**
```
    @EventHandler
    public void onClanChat(ClanChatEvent event) {
        
    }
    
    @EventHandler
    public void onAllyChat(AllyChatEvent event) {
        
    }

    @EventHandler
    public void onPlayerMove(ClaimResidentEvent event) {
        
    }

    @EventHandler
    public void onRaidShieldChange(RaidShieldEvent event) {
            
    }
    
    @EventHandler
    public void onClaimInteract(ClaimBuildEvent event) {
            
    }
    
    @EventHandler
    public void onPlayerKill(PlayerKillPlayerEvent event) {
            
    }

    @EventHandler
    public void onPlayerHit(PlayerPunchPlayerEvent event) {
            
    }

    @EventHandler
    public void onPlayerShoot(PlayerShootPlayerEvent event) {
            
    }
```

**Know your API**

```JAVA 
public Clan clan = new Clan(clanID, Player); //- [Utility class for getting clan information.] Player variable can be null.
```

```JAVA 
public Claim claim = new Claim(claimID, Player); //- [Utility class for getting information regarding a claim.] Player variable can be null.
```

```JAVA 
public ClanUtil clanUtil = new ClanUtil(); //- [Utility class for setting clan information and getting player information]
```

```JAVA 
public ClaimUtil claimUtil = new ClaimUtil(); //- [Utility class for setting claim information]
```

```JAVA 
public StringLibrary lib = new StringLibrary(); //- [Utility class for handling player messaging and list pagination.]
```
