package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusobsarray extends GXProcedure
{
   public pbusobsarray( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusobsarray.class ), "" );
   }

   public pbusobsarray( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pbusobsarray.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pbusobsarray.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusobsarray.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pbusobsarray.this.AV35LastDiscod = aP2[0];
      this.aP2 = aP2;
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
      pbusobsarray.this.GXt_int1 = GXv_int2[0] ;
      AV25FlagObsA = GXt_int1 ;
      GXt_int3 = AV29LinObs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "OBSART", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pbusobsarray.this.A396EmprCod = GXv_char4[0] ;
      pbusobsarray.this.GXt_int3 = GXv_int6[0] ;
      AV29LinObs = GXt_int3 ;
      GXt_int1 = AV31Memo2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MEMO2", ""), GXv_int2) ;
      pbusobsarray.this.GXt_int1 = GXv_int2[0] ;
      AV31Memo2 = GXt_int1 ;
      if ( AV35LastDiscod > 0 )
      {
         AV22ContLin = (byte)(0) ;
         /* Using cursor P05WT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV35LastDiscod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A377DisObsTxt = P05WT2_A377DisObsTxt[0] ;
            A376DisObsLin = P05WT2_A376DisObsLin[0] ;
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            /*
               INSERT RECORD ON TABLE TXPOBSERV

            */
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W376DisObsLin = A376DisObsLin ;
            W377DisObsTxt = A377DisObsTxt ;
            /* Using cursor P05WT3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            A376DisObsLin = W376DisObsLin ;
            A377DisObsTxt = W377DisObsTxt ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV29LinObs == 0 )
      {
         AV29LinObs = 6 ;
      }
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
            /* Using cursor P05WT4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A335DisArtCod = P05WT4_A335DisArtCod[0] ;
               A252CliCod = P05WT4_A252CliCod[0] ;
               A378DisObsULin = P05WT4_A378DisObsULin[0] ;
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
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV18FlagObs == 1 )
               {
                  A378DisObsULin = (byte)(A378DisObsULin+AV22ContLin) ;
               }
               /* Using cursor P05WT5 */
               pr_default.execute(3, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
         }
         else
         {
            /* Using cursor P05WT6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A335DisArtCod = P05WT6_A335DisArtCod[0] ;
               A252CliCod = P05WT6_A252CliCod[0] ;
               A11658DisMemo2 = P05WT6_A11658DisMemo2[0] ;
               AV15DisArtCod = A335DisArtCod ;
               AV16CliCod = A252CliCod ;
               AV17EmprCod = A396EmprCod ;
               /* Execute user subroutine: 'OBS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               A11658DisMemo2 = GXutil.trim( AV30VarObs) ;
               /* Using cursor P05WT7 */
               pr_default.execute(5, new Object[] {A11658DisMemo2, A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OBS' Routine */
      returnInSub = false ;
      AV18FlagObs = (byte)(0) ;
      /* Using cursor P05WT8 */
      pr_default.execute(6, new Object[] {AV17EmprCod, Integer.valueOf(AV16CliCod), AV15DisArtCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A3072ArtObsLon = P05WT8_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P05WT8_n3072ArtObsLon[0] ;
         A65ArtCod = P05WT8_A65ArtCod[0] ;
         A252CliCod = P05WT8_A252CliCod[0] ;
         A90ArtObsFac = P05WT8_A90ArtObsFac[0] ;
         n90ArtObsFac = P05WT8_n90ArtObsFac[0] ;
         AV18FlagObs = (byte)(1) ;
         AV23Nlin = (short)(GXutil.gxmlines( A3072ArtObsLon, (short)(60))) ;
         AV24i = (short)(1) ;
         while ( AV24i <= AV23Nlin )
         {
            if ( AV24i > AV29LinObs )
            {
               if (true) break;
            }
            AV32DisObstxt = GXutil.gxgetmli( A3072ArtObsLon, AV24i, (short)(60)) ;
            if ( GXutil.strcmp(AV32DisObstxt, " ") != 0 )
            {
               AV30VarObs += AV32DisObstxt ;
            }
            AV24i = (short)(AV24i+1) ;
         }
         if ( GXutil.strcmp(AV30VarObs, " ") == 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( AV31Memo2 == 0 )
         {
            AV24i = (short)(1) ;
            while ( AV24i <= AV23Nlin )
            {
               if ( AV24i > AV29LinObs )
               {
                  if (true) break;
               }
               AV19ObsTxt = GXutil.gxgetmli( A3072ArtObsLon, AV24i, (short)(60)) ;
               /*
                  INSERT RECORD ON TABLE TXPOBSERV

               */
               AV22ContLin = (byte)(AV22ContLin+1) ;
               A376DisObsLin = AV22ContLin ;
               A377DisObsTxt = AV19ObsTxt ;
               /* Using cursor P05WT9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
               if ( (pr_default.getStatus(7) == 1) )
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
               AV24i = (short)(AV24i+1) ;
            }
         }
         AV27ArtObsFac = A90ArtObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusobsarray.this.A396EmprCod;
      this.aP1[0] = pbusobsarray.this.A361DisCod;
      this.aP2[0] = pbusobsarray.this.AV35LastDiscod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbusobsarray");
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
      P05WT2_A396EmprCod = new String[] {""} ;
      P05WT2_A377DisObsTxt = new String[] {""} ;
      P05WT2_A376DisObsLin = new byte[1] ;
      P05WT2_A361DisCod = new int[1] ;
      A377DisObsTxt = "" ;
      W396EmprCod = "" ;
      W377DisObsTxt = "" ;
      Gx_emsg = "" ;
      P05WT4_A396EmprCod = new String[] {""} ;
      P05WT4_A361DisCod = new int[1] ;
      P05WT4_A335DisArtCod = new String[] {""} ;
      P05WT4_A252CliCod = new int[1] ;
      P05WT4_A378DisObsULin = new byte[1] ;
      A335DisArtCod = "" ;
      AV15DisArtCod = "" ;
      AV17EmprCod = "" ;
      P05WT6_A396EmprCod = new String[] {""} ;
      P05WT6_A361DisCod = new int[1] ;
      P05WT6_A335DisArtCod = new String[] {""} ;
      P05WT6_A252CliCod = new int[1] ;
      P05WT6_A11658DisMemo2 = new String[] {""} ;
      A11658DisMemo2 = "" ;
      AV30VarObs = "" ;
      P05WT8_A3072ArtObsLon = new String[] {""} ;
      P05WT8_n3072ArtObsLon = new boolean[] {false} ;
      P05WT8_A396EmprCod = new String[] {""} ;
      P05WT8_A65ArtCod = new String[] {""} ;
      P05WT8_A252CliCod = new int[1] ;
      P05WT8_A90ArtObsFac = new String[] {""} ;
      P05WT8_n90ArtObsFac = new boolean[] {false} ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      A90ArtObsFac = "" ;
      AV32DisObstxt = "" ;
      AV19ObsTxt = "" ;
      AV27ArtObsFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusobsarray__default(),
         new Object[] {
             new Object[] {
            P05WT2_A396EmprCod, P05WT2_A377DisObsTxt, P05WT2_A376DisObsLin, P05WT2_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05WT4_A396EmprCod, P05WT4_A361DisCod, P05WT4_A335DisArtCod, P05WT4_A252CliCod, P05WT4_A378DisObsULin
            }
            , new Object[] {
            }
            , new Object[] {
            P05WT6_A396EmprCod, P05WT6_A361DisCod, P05WT6_A335DisArtCod, P05WT6_A252CliCod, P05WT6_A11658DisMemo2
            }
            , new Object[] {
            }
            , new Object[] {
            P05WT8_A3072ArtObsLon, P05WT8_n3072ArtObsLon, P05WT8_A396EmprCod, P05WT8_A65ArtCod, P05WT8_A252CliCod, P05WT8_A90ArtObsFac, P05WT8_n90ArtObsFac
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
   private byte AV22ContLin ;
   private byte A376DisObsLin ;
   private byte W376DisObsLin ;
   private byte A378DisObsULin ;
   private byte AV18FlagObs ;
   private short Gx_err ;
   private short AV23Nlin ;
   private short AV24i ;
   private int A361DisCod ;
   private int AV35LastDiscod ;
   private int AV29LinObs ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int W361DisCod ;
   private int GX_INS40 ;
   private int A252CliCod ;
   private int AV16CliCod ;
   private String A396EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A377DisObsTxt ;
   private String W396EmprCod ;
   private String W377DisObsTxt ;
   private String Gx_emsg ;
   private String A335DisArtCod ;
   private String AV15DisArtCod ;
   private String AV17EmprCod ;
   private String A65ArtCod ;
   private String A90ArtObsFac ;
   private String AV32DisObstxt ;
   private String AV19ObsTxt ;
   private String AV27ArtObsFac ;
   private boolean returnInSub ;
   private boolean n3072ArtObsLon ;
   private boolean n90ArtObsFac ;
   private String A3072ArtObsLon ;
   private String A11658DisMemo2 ;
   private String AV30VarObs ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05WT2_A396EmprCod ;
   private String[] P05WT2_A377DisObsTxt ;
   private byte[] P05WT2_A376DisObsLin ;
   private int[] P05WT2_A361DisCod ;
   private String[] P05WT4_A396EmprCod ;
   private int[] P05WT4_A361DisCod ;
   private String[] P05WT4_A335DisArtCod ;
   private int[] P05WT4_A252CliCod ;
   private byte[] P05WT4_A378DisObsULin ;
   private String[] P05WT6_A396EmprCod ;
   private int[] P05WT6_A361DisCod ;
   private String[] P05WT6_A335DisArtCod ;
   private int[] P05WT6_A252CliCod ;
   private String[] P05WT6_A11658DisMemo2 ;
   private String[] P05WT8_A3072ArtObsLon ;
   private boolean[] P05WT8_n3072ArtObsLon ;
   private String[] P05WT8_A396EmprCod ;
   private String[] P05WT8_A65ArtCod ;
   private int[] P05WT8_A252CliCod ;
   private String[] P05WT8_A90ArtObsFac ;
   private boolean[] P05WT8_n90ArtObsFac ;
}

final  class pbusobsarray__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05WT2", "SELECT EmprCod, DisObsTxt, DisObsLin, DisCod FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05WT3", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new ForEachCursor("P05WT4", "SELECT EmprCod, DisCod, DisArtCod, CliCod, DisObsULin FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05WT5", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P05WT6", "SELECT EmprCod, DisCod, DisArtCod, CliCod, DisMemo2 FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05WT7", "UPDATE TXPDISPOS SET DisMemo2=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P05WT8", "SELECT ArtObsLon, EmprCod, ArtCod, CliCod, ArtObsFac FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05WT9", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               return;
            case 6 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2000, false);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
      }
   }

}

