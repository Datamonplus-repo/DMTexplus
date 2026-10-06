package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgrbpro extends GXProcedure
{
   public pgrbpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgrbpro.class ), "" );
   }

   public pgrbpro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pgrbpro.this.aP1 = new int[] {0};
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
      pgrbpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgrbpro.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00A02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A335DisArtCod = P00A02_A335DisArtCod[0] ;
         W396EmprCod = A396EmprCod ;
         AV16DisArtCod = A335DisArtCod ;
         /* Using cursor P00A03 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A252CliCod = P00A03_A252CliCod[0] ;
            A846UltFasLin = P00A03_A846UltFasLin[0] ;
            A758ProCod = P00A03_A758ProCod[0] ;
            A252CliCod = P00A03_A252CliCod[0] ;
            W396EmprCod = A396EmprCod ;
            AV15ProCod = A758ProCod ;
            /*
               INSERT RECORD ON TABLE TXPARTLIN

            */
            W758ProCod = A758ProCod ;
            A65ArtCod = AV16DisArtCod ;
            A758ProCod = AV15ProCod ;
            /* Using cursor P00A04 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
            if ( (pr_default.getStatus(2) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A758ProCod = W758ProCod ;
            /* End Insert */
            /* Using cursor P00A05 */
            pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A457FasCod = P00A05_A457FasCod[0] ;
               A396EmprCod = P00A05_A396EmprCod[0] ;
               A774ProNumLin = P00A05_A774ProNumLin[0] ;
               /*
                  INSERT RECORD ON TABLE TXPSERPAU

               */
               W758ProCod = A758ProCod ;
               W252CliCod = A252CliCod ;
               W396EmprCod = A396EmprCod ;
               W457FasCod = A457FasCod ;
               A65ArtCod = AV16DisArtCod ;
               A758ProCod = AV15ProCod ;
               /* Using cursor P00A06 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
               if ( (pr_default.getStatus(4) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A758ProCod = W758ProCod ;
               A252CliCod = W252CliCod ;
               A396EmprCod = W396EmprCod ;
               A457FasCod = W457FasCod ;
               /* End Insert */
               pr_default.readNext(3);
            }
            pr_default.close(3);
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgrbpro.this.A396EmprCod;
      this.aP1[0] = pgrbpro.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pgrbpro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00A02_A396EmprCod = new String[] {""} ;
      P00A02_A361DisCod = new int[1] ;
      P00A02_A335DisArtCod = new String[] {""} ;
      A335DisArtCod = "" ;
      W396EmprCod = "" ;
      AV16DisArtCod = "" ;
      P00A03_A396EmprCod = new String[] {""} ;
      P00A03_A361DisCod = new int[1] ;
      P00A03_A252CliCod = new int[1] ;
      P00A03_A846UltFasLin = new short[1] ;
      P00A03_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV15ProCod = "" ;
      W758ProCod = "" ;
      A65ArtCod = "" ;
      Gx_emsg = "" ;
      P00A05_A758ProCod = new String[] {""} ;
      P00A05_A457FasCod = new String[] {""} ;
      P00A05_A396EmprCod = new String[] {""} ;
      P00A05_A774ProNumLin = new short[1] ;
      A457FasCod = "" ;
      W457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgrbpro__default(),
         new Object[] {
             new Object[] {
            P00A02_A396EmprCod, P00A02_A361DisCod, P00A02_A335DisArtCod
            }
            , new Object[] {
            P00A03_A396EmprCod, P00A03_A361DisCod, P00A03_A252CliCod, P00A03_A846UltFasLin, P00A03_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00A05_A758ProCod, P00A05_A457FasCod, P00A05_A396EmprCod, P00A05_A774ProNumLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A846UltFasLin ;
   private short Gx_err ;
   private short A774ProNumLin ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int GX_INS11 ;
   private int GX_INS476 ;
   private int W252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String W396EmprCod ;
   private String AV16DisArtCod ;
   private String A758ProCod ;
   private String AV15ProCod ;
   private String W758ProCod ;
   private String A65ArtCod ;
   private String Gx_emsg ;
   private String A457FasCod ;
   private String W457FasCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00A02_A396EmprCod ;
   private int[] P00A02_A361DisCod ;
   private String[] P00A02_A335DisArtCod ;
   private String[] P00A03_A396EmprCod ;
   private int[] P00A03_A361DisCod ;
   private int[] P00A03_A252CliCod ;
   private short[] P00A03_A846UltFasLin ;
   private String[] P00A03_A758ProCod ;
   private String[] P00A05_A758ProCod ;
   private String[] P00A05_A457FasCod ;
   private String[] P00A05_A396EmprCod ;
   private short[] P00A05_A774ProNumLin ;
}

final  class pgrbpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00A02", "SELECT EmprCod, DisCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00A03", "SELECT T1.EmprCod, T1.DisCod, T2.CliCod, T1.UltFasLin, T1.ProCod FROM (TXPDISLIN T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00A04", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new ForEachCursor("P00A05", "SELECT ProCod, FasCod, EmprCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00A06", "INSERT INTO TXPSERPAU(EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProULin, ArtProFacT, ArtProFac, CCTCod, ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs) VALUES(?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAU")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

