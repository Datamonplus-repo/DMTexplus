package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbpr1 extends GXProcedure
{
   public palbpr1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbpr1.class ), "" );
   }

   public palbpr1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      palbpr1.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      palbpr1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbpr1.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      palbpr1.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      palbpr1.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      palbpr1.this.AV19procod = aP4[0];
      this.aP4 = aP4;
      palbpr1.this.AV20ProDsc = aP5[0];
      this.aP5 = aP5;
      palbpr1.this.AV21Procenom = aP6[0];
      this.aP6 = aP6;
      palbpr1.this.AV25Artobsfac = aP7[0];
      this.aP7 = aP7;
      palbpr1.this.AV26AlbHdrObs = aP8[0];
      this.aP8 = aP8;
      palbpr1.this.AV27Barcodban = aP9[0];
      this.aP9 = aP9;
      palbpr1.this.AV28Barplf = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV26AlbHdrObs, " ") != 0 ) || ( GXutil.strcmp(AV27Barcodban, " ") != 0 ) )
      {
         if ( GXutil.strcmp(AV27Barcodban, " ") != 0 )
         {
            AV19procod = AV27Barcodban ;
            AV20ProDsc = AV27Barcodban ;
         }
         if ( ( GXutil.strcmp(AV26AlbHdrObs, " ") != 0 ) || ( GXutil.strcmp(AV27Barcodban, " ") == 0 ) )
         {
            AV19procod = AV26AlbHdrObs ;
            AV20ProDsc = AV26AlbHdrObs ;
         }
         Gx_msg = httpContext.getMessage( "&procod =", "") + AV19procod ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P02SY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02SY2_A361DisCod[0] ;
         A252CliCod = P02SY2_A252CliCod[0] ;
         n252CliCod = P02SY2_n252CliCod[0] ;
         A212BarSer = P02SY2_A212BarSer[0] ;
         AV22Discod = A361DisCod ;
         /* Execute user subroutine: 'DISALB' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P02SY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A758ProCod = P02SY3_A758ProCod[0] ;
            AV19procod = A758ProCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV23Clicod = A252CliCod ;
         AV24Artcod = A212BarSer ;
         /* Execute user subroutine: 'ARTICU' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DISALB' Routine */
      returnInSub = false ;
      AV21Procenom = " " ;
      /* Using cursor P02SY4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV22Discod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A966PartCod = P02SY4_A966PartCod[0] ;
         n966PartCod = P02SY4_n966PartCod[0] ;
         A252CliCod = P02SY4_A252CliCod[0] ;
         n252CliCod = P02SY4_n252CliCod[0] ;
         A970ProceCod = P02SY4_A970ProceCod[0] ;
         n970ProceCod = P02SY4_n970ProceCod[0] ;
         A361DisCod = P02SY4_A361DisCod[0] ;
         A971ProceNom = P02SY4_A971ProceNom[0] ;
         n971ProceNom = P02SY4_n971ProceNom[0] ;
         A970ProceCod = P02SY4_A970ProceCod[0] ;
         n970ProceCod = P02SY4_n970ProceCod[0] ;
         A971ProceNom = P02SY4_A971ProceNom[0] ;
         n971ProceNom = P02SY4_n971ProceNom[0] ;
         AV21Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV25Artobsfac = " " ;
      /* Using cursor P02SY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV23Clicod), AV24Artcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P02SY5_A65ArtCod[0] ;
         A252CliCod = P02SY5_A252CliCod[0] ;
         n252CliCod = P02SY5_n252CliCod[0] ;
         A90ArtObsFac = P02SY5_A90ArtObsFac[0] ;
         n90ArtObsFac = P02SY5_n90ArtObsFac[0] ;
         AV25Artobsfac = A90ArtObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbpr1.this.A396EmprCod;
      this.aP1[0] = palbpr1.this.A129BarCod;
      this.aP2[0] = palbpr1.this.A132BarCodReo;
      this.aP3[0] = palbpr1.this.A130BarCodPar;
      this.aP4[0] = palbpr1.this.AV19procod;
      this.aP5[0] = palbpr1.this.AV20ProDsc;
      this.aP6[0] = palbpr1.this.AV21Procenom;
      this.aP7[0] = palbpr1.this.AV25Artobsfac;
      this.aP8[0] = palbpr1.this.AV26AlbHdrObs;
      this.aP9[0] = palbpr1.this.AV27Barcodban;
      this.aP10[0] = palbpr1.this.AV28Barplf;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P02SY2_A396EmprCod = new String[] {""} ;
      P02SY2_A129BarCod = new int[1] ;
      P02SY2_A132BarCodReo = new byte[1] ;
      P02SY2_A130BarCodPar = new String[] {""} ;
      P02SY2_A361DisCod = new int[1] ;
      P02SY2_A252CliCod = new int[1] ;
      P02SY2_n252CliCod = new boolean[] {false} ;
      P02SY2_A212BarSer = new String[] {""} ;
      A212BarSer = "" ;
      P02SY3_A396EmprCod = new String[] {""} ;
      P02SY3_A129BarCod = new int[1] ;
      P02SY3_A132BarCodReo = new byte[1] ;
      P02SY3_A130BarCodPar = new String[] {""} ;
      P02SY3_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV24Artcod = "" ;
      P02SY4_A966PartCod = new String[] {""} ;
      P02SY4_n966PartCod = new boolean[] {false} ;
      P02SY4_A252CliCod = new int[1] ;
      P02SY4_n252CliCod = new boolean[] {false} ;
      P02SY4_A970ProceCod = new short[1] ;
      P02SY4_n970ProceCod = new boolean[] {false} ;
      P02SY4_A396EmprCod = new String[] {""} ;
      P02SY4_A361DisCod = new int[1] ;
      P02SY4_A971ProceNom = new String[] {""} ;
      P02SY4_n971ProceNom = new boolean[] {false} ;
      A966PartCod = "" ;
      A971ProceNom = "" ;
      P02SY5_A396EmprCod = new String[] {""} ;
      P02SY5_A65ArtCod = new String[] {""} ;
      P02SY5_A252CliCod = new int[1] ;
      P02SY5_n252CliCod = new boolean[] {false} ;
      P02SY5_A90ArtObsFac = new String[] {""} ;
      P02SY5_n90ArtObsFac = new boolean[] {false} ;
      A65ArtCod = "" ;
      A90ArtObsFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbpr1__default(),
         new Object[] {
             new Object[] {
            P02SY2_A396EmprCod, P02SY2_A129BarCod, P02SY2_A132BarCodReo, P02SY2_A130BarCodPar, P02SY2_A361DisCod, P02SY2_A252CliCod, P02SY2_n252CliCod, P02SY2_A212BarSer
            }
            , new Object[] {
            P02SY3_A396EmprCod, P02SY3_A129BarCod, P02SY3_A132BarCodReo, P02SY3_A130BarCodPar, P02SY3_A758ProCod
            }
            , new Object[] {
            P02SY4_A966PartCod, P02SY4_n966PartCod, P02SY4_A252CliCod, P02SY4_A970ProceCod, P02SY4_n970ProceCod, P02SY4_A396EmprCod, P02SY4_A361DisCod, P02SY4_A971ProceNom, P02SY4_n971ProceNom
            }
            , new Object[] {
            P02SY5_A396EmprCod, P02SY5_A65ArtCod, P02SY5_A252CliCod, P02SY5_A90ArtObsFac, P02SY5_n90ArtObsFac
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV22Discod ;
   private int AV23Clicod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV19procod ;
   private String AV20ProDsc ;
   private String AV21Procenom ;
   private String AV25Artobsfac ;
   private String AV26AlbHdrObs ;
   private String AV27Barcodban ;
   private String AV28Barplf ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A758ProCod ;
   private String AV24Artcod ;
   private String A966PartCod ;
   private String A971ProceNom ;
   private String A65ArtCod ;
   private String A90ArtObsFac ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n90ArtObsFac ;
   private String[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P02SY2_A396EmprCod ;
   private int[] P02SY2_A129BarCod ;
   private byte[] P02SY2_A132BarCodReo ;
   private String[] P02SY2_A130BarCodPar ;
   private int[] P02SY2_A361DisCod ;
   private int[] P02SY2_A252CliCod ;
   private boolean[] P02SY2_n252CliCod ;
   private String[] P02SY2_A212BarSer ;
   private String[] P02SY3_A396EmprCod ;
   private int[] P02SY3_A129BarCod ;
   private byte[] P02SY3_A132BarCodReo ;
   private String[] P02SY3_A130BarCodPar ;
   private String[] P02SY3_A758ProCod ;
   private String[] P02SY4_A966PartCod ;
   private boolean[] P02SY4_n966PartCod ;
   private int[] P02SY4_A252CliCod ;
   private boolean[] P02SY4_n252CliCod ;
   private short[] P02SY4_A970ProceCod ;
   private boolean[] P02SY4_n970ProceCod ;
   private String[] P02SY4_A396EmprCod ;
   private int[] P02SY4_A361DisCod ;
   private String[] P02SY4_A971ProceNom ;
   private boolean[] P02SY4_n971ProceNom ;
   private String[] P02SY5_A396EmprCod ;
   private String[] P02SY5_A65ArtCod ;
   private int[] P02SY5_A252CliCod ;
   private boolean[] P02SY5_n252CliCod ;
   private String[] P02SY5_A90ArtObsFac ;
   private boolean[] P02SY5_n90ArtObsFac ;
}

final  class palbpr1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02SY2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod, CliCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02SY3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02SY4", "SELECT T1.PartCod, T1.CliCod, T2.ProceCod, T1.EmprCod, T1.DisCod, T3.ProceNom FROM ((TXPDISPOS T1 LEFT JOIN TXPCPARTI T2 ON T2.EmprCod = T1.EmprCod AND T2.PartCod = T1.PartCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T2.ProceCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02SY5", "SELECT EmprCod, ArtCod, CliCod, ArtObsFac FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

