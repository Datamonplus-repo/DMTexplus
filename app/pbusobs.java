package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusobs extends GXProcedure
{
   public pbusobs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusobs.class ), "" );
   }

   public pbusobs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pbusobs.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pbusobs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusobs.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV25FlagObsA ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOOBSA", ""), GXv_int2) ;
      pbusobs.this.GXt_int1 = GXv_int2[0] ;
      AV25FlagObsA = GXt_int1 ;
      GXt_int3 = AV29LinObs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "OBSART", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pbusobs.this.A396EmprCod = GXv_char4[0] ;
      pbusobs.this.GXt_int3 = GXv_int6[0] ;
      AV29LinObs = GXt_int3 ;
      GXt_int1 = AV31Memo2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MEMO2", ""), GXv_int2) ;
      pbusobs.this.GXt_int1 = GXv_int2[0] ;
      AV31Memo2 = GXt_int1 ;
      AV29LinObs = ((AV29LinObs==0) ? 9 : AV29LinObs) ;
      if ( AV25FlagObsA == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         if ( AV31Memo2 == 0 )
         {
            /* Using cursor P00AB2 */
            pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A335DisArtCod = P00AB2_A335DisArtCod[0] ;
               A252CliCod = P00AB2_A252CliCod[0] ;
               A378DisObsULin = P00AB2_A378DisObsULin[0] ;
               AV15DisArtCod = A335DisArtCod ;
               AV16CliCod = A252CliCod ;
               AV17EmprCod = A396EmprCod ;
               if ( A378DisObsULin > 0 )
               {
                  AV22ContLin = A378DisObsULin ;
               }
               /* Execute user subroutine: 'OBS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV18FlagObs == 1 )
               {
                  A378DisObsULin = (byte)(A378DisObsULin+AV22ContLin) ;
               }
               /* Using cursor P00AB3 */
               pr_default.execute(1, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
         }
         else
         {
            /* Using cursor P00AB4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A335DisArtCod = P00AB4_A335DisArtCod[0] ;
               A252CliCod = P00AB4_A252CliCod[0] ;
               A11658DisMemo2 = P00AB4_A11658DisMemo2[0] ;
               AV15DisArtCod = A335DisArtCod ;
               AV16CliCod = A252CliCod ;
               AV17EmprCod = A396EmprCod ;
               /* Execute user subroutine: 'OBS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               A11658DisMemo2 = GXutil.trim( AV30VarObs) ;
               /* Using cursor P00AB5 */
               pr_default.execute(3, new Object[] {A11658DisMemo2, A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OBS' Routine */
      returnInSub = false ;
      AV18FlagObs = (byte)(0) ;
      /* Using cursor P00AB6 */
      pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV16CliCod), AV15DisArtCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A3072ArtObsLon = P00AB6_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P00AB6_n3072ArtObsLon[0] ;
         A65ArtCod = P00AB6_A65ArtCod[0] ;
         A252CliCod = P00AB6_A252CliCod[0] ;
         A90ArtObsFac = P00AB6_A90ArtObsFac[0] ;
         n90ArtObsFac = P00AB6_n90ArtObsFac[0] ;
         AV18FlagObs = (byte)(1) ;
         AV23Nlin = (short)(GXutil.gxmlines( A3072ArtObsLon, (short)(60))) ;
         AV24I = (short)(1) ;
         while ( AV24I <= AV23Nlin )
         {
            if ( AV24I > AV29LinObs )
            {
               if (true) break;
            }
            AV32DisObstxt = GXutil.gxgetmli( A3072ArtObsLon, AV24I, (short)(60)) ;
            if ( GXutil.strcmp(AV32DisObstxt, " ") != 0 )
            {
               AV30VarObs += AV32DisObstxt ;
            }
            AV24I = (short)(AV24I+1) ;
         }
         if ( GXutil.strcmp(AV30VarObs, " ") == 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( AV31Memo2 == 0 )
         {
            AV24I = (short)(1) ;
            while ( AV24I <= AV23Nlin )
            {
               if ( AV24I > AV29LinObs )
               {
                  if (true) break;
               }
               AV19ObsTxt = GXutil.gxgetmli( A3072ArtObsLon, AV24I, (short)(60)) ;
               /*
                  INSERT RECORD ON TABLE TXPOBSERV

               */
               AV22ContLin = (byte)(AV22ContLin+1) ;
               A376DisObsLin = AV22ContLin ;
               A377DisObsTxt = AV19ObsTxt ;
               /* Using cursor P00AB7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
               if ( (pr_default.getStatus(5) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
               AV24I = (short)(AV24I+1) ;
            }
         }
         AV27ArtObsFac = A90ArtObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusobs.this.A396EmprCod;
      this.aP1[0] = pbusobs.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbusobs");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P00AB2_A396EmprCod = new String[] {""} ;
      P00AB2_A361DisCod = new int[1] ;
      P00AB2_A335DisArtCod = new String[] {""} ;
      P00AB2_A252CliCod = new int[1] ;
      P00AB2_A378DisObsULin = new byte[1] ;
      A335DisArtCod = "" ;
      AV15DisArtCod = "" ;
      AV17EmprCod = "" ;
      P00AB4_A396EmprCod = new String[] {""} ;
      P00AB4_A361DisCod = new int[1] ;
      P00AB4_A335DisArtCod = new String[] {""} ;
      P00AB4_A252CliCod = new int[1] ;
      P00AB4_A11658DisMemo2 = new String[] {""} ;
      A11658DisMemo2 = "" ;
      AV30VarObs = "" ;
      P00AB6_A3072ArtObsLon = new String[] {""} ;
      P00AB6_n3072ArtObsLon = new boolean[] {false} ;
      P00AB6_A396EmprCod = new String[] {""} ;
      P00AB6_A65ArtCod = new String[] {""} ;
      P00AB6_A252CliCod = new int[1] ;
      P00AB6_A90ArtObsFac = new String[] {""} ;
      P00AB6_n90ArtObsFac = new boolean[] {false} ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      A90ArtObsFac = "" ;
      AV32DisObstxt = "" ;
      AV19ObsTxt = "" ;
      A377DisObsTxt = "" ;
      Gx_emsg = "" ;
      AV27ArtObsFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusobs__default(),
         new Object[] {
             new Object[] {
            P00AB2_A396EmprCod, P00AB2_A361DisCod, P00AB2_A335DisArtCod, P00AB2_A252CliCod, P00AB2_A378DisObsULin
            }
            , new Object[] {
            }
            , new Object[] {
            P00AB4_A396EmprCod, P00AB4_A361DisCod, P00AB4_A335DisArtCod, P00AB4_A252CliCod, P00AB4_A11658DisMemo2
            }
            , new Object[] {
            }
            , new Object[] {
            P00AB6_A3072ArtObsLon, P00AB6_n3072ArtObsLon, P00AB6_A396EmprCod, P00AB6_A65ArtCod, P00AB6_A252CliCod, P00AB6_A90ArtObsFac, P00AB6_n90ArtObsFac
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25FlagObsA ;
   private byte AV31Memo2 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A378DisObsULin ;
   private byte AV22ContLin ;
   private byte AV18FlagObs ;
   private byte A376DisObsLin ;
   private short AV23Nlin ;
   private short AV24I ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV29LinObs ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A252CliCod ;
   private int AV16CliCod ;
   private int GX_INS40 ;
   private String A396EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String AV15DisArtCod ;
   private String AV17EmprCod ;
   private String A65ArtCod ;
   private String A90ArtObsFac ;
   private String AV32DisObstxt ;
   private String AV19ObsTxt ;
   private String A377DisObsTxt ;
   private String Gx_emsg ;
   private String AV27ArtObsFac ;
   private boolean returnInSub ;
   private boolean n3072ArtObsLon ;
   private boolean n90ArtObsFac ;
   private String A3072ArtObsLon ;
   private String A11658DisMemo2 ;
   private String AV30VarObs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00AB2_A396EmprCod ;
   private int[] P00AB2_A361DisCod ;
   private String[] P00AB2_A335DisArtCod ;
   private int[] P00AB2_A252CliCod ;
   private byte[] P00AB2_A378DisObsULin ;
   private String[] P00AB4_A396EmprCod ;
   private int[] P00AB4_A361DisCod ;
   private String[] P00AB4_A335DisArtCod ;
   private int[] P00AB4_A252CliCod ;
   private String[] P00AB4_A11658DisMemo2 ;
   private String[] P00AB6_A3072ArtObsLon ;
   private boolean[] P00AB6_n3072ArtObsLon ;
   private String[] P00AB6_A396EmprCod ;
   private String[] P00AB6_A65ArtCod ;
   private int[] P00AB6_A252CliCod ;
   private String[] P00AB6_A90ArtObsFac ;
   private boolean[] P00AB6_n90ArtObsFac ;
}

final  class pbusobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00AB2", "SELECT EmprCod, DisCod, DisArtCod, CliCod, DisObsULin FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00AB3", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P00AB4", "SELECT EmprCod, DisCod, DisArtCod, CliCod, DisMemo2 FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00AB5", "UPDATE TXPDISPOS SET DisMemo2=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P00AB6", "SELECT ArtObsLon, EmprCod, ArtCod, CliCod, ArtObsFac FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00AB7", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2000, false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
      }
   }

}

