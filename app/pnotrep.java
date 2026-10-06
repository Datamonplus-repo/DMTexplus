package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnotrep extends GXProcedure
{
   public pnotrep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnotrep.class ), "" );
   }

   public pnotrep( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 )
   {
      pnotrep.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 )
   {
      pnotrep.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnotrep.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pnotrep.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pnotrep.this.AV12CliNom = aP3[0];
      this.aP3 = aP3;
      pnotrep.this.AV14Nr_albent = aP4[0];
      this.aP4 = aP4;
      pnotrep.this.AV15Nr_artcod = aP5[0];
      this.aP5 = aP5;
      pnotrep.this.AV16Nr_artdsc = aP6[0];
      this.aP6 = aP6;
      pnotrep.this.AV17Nr_piezas = aP7[0];
      this.aP7 = aP7;
      pnotrep.this.AV19Nr_kilos = aP8[0];
      this.aP8 = aP8;
      pnotrep.this.AV18Nr_unidad = aP9[0];
      this.aP9 = aP9;
      pnotrep.this.AV20Nr_ParNMtr = aP10[0];
      this.aP10 = aP10;
      pnotrep.this.AV10Ctrl_r = aP11[0];
      this.aP11 = aP11;
      pnotrep.this.Gx_msg = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Ctrl_r = (byte)(0) ;
      Gx_msg = GXutil.space( (short)(70)) ;
      /* Using cursor P02RF3 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A279CliNom = P02RF3_A279CliNom[0] ;
         A1456ParArtCod = P02RF3_A1456ParArtCod[0] ;
         n1456ParArtCod = P02RF3_n1456ParArtCod[0] ;
         A2240PartDsc = P02RF3_A2240PartDsc[0] ;
         n2240PartDsc = P02RF3_n2240PartDsc[0] ;
         A1457ParNMtr = P02RF3_A1457ParNMtr[0] ;
         n1457ParNMtr = P02RF3_n1457ParNMtr[0] ;
         A2244PartReo = P02RF3_A2244PartReo[0] ;
         n2244PartReo = P02RF3_n2244PartReo[0] ;
         A973PartKilEnt = P02RF3_A973PartKilEnt[0] ;
         A974PartConEnt = P02RF3_A974PartConEnt[0] ;
         A279CliNom = P02RF3_A279CliNom[0] ;
         A973PartKilEnt = P02RF3_A973PartKilEnt[0] ;
         A974PartConEnt = P02RF3_A974PartConEnt[0] ;
         AV12CliNom = A279CliNom ;
         AV15Nr_artcod = A1456ParArtCod ;
         AV16Nr_artdsc = A2240PartDsc ;
         AV19Nr_kilos = A973PartKilEnt ;
         AV17Nr_piezas = A974PartConEnt ;
         AV18Nr_unidad = httpContext.getMessage( "K", "") ;
         AV20Nr_ParNMtr = A1457ParNMtr ;
         AV10Ctrl_r = (byte)(0) ;
         if ( GXutil.strcmp(A2244PartReo, httpContext.getMessage( "SI", "")) == 0 )
         {
            AV10Ctrl_r = (byte)(1) ;
         }
         AV14Nr_albent = "" ;
         /* Using cursor P02RF4 */
         pr_default.execute(1, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A980PartLinTip = P02RF4_A980PartLinTip[0] ;
            n980PartLinTip = P02RF4_n980PartLinTip[0] ;
            A981PartAlbDis = P02RF4_A981PartAlbDis[0] ;
            n981PartAlbDis = P02RF4_n981PartAlbDis[0] ;
            A979PartLin = P02RF4_A979PartLin[0] ;
            if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "E", "")) == 0 )
            {
               AV14Nr_albent = GXutil.str( A981PartAlbDis, 8, 0) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV13PartCod = A966PartCod ;
         /* Execute user subroutine: 'NOTREC' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
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
      /* 'NOTREC' Routine */
      returnInSub = false ;
      /* Using cursor P02RF5 */
      pr_default.execute(2, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A7090Nr_PartCod = P02RF5_A7090Nr_PartCod[0] ;
         n7090Nr_PartCod = P02RF5_n7090Nr_PartCod[0] ;
         A5340Nr_CliCod = P02RF5_A5340Nr_CliCod[0] ;
         n5340Nr_CliCod = P02RF5_n5340Nr_CliCod[0] ;
         A5198Nr_codigo = P02RF5_A5198Nr_codigo[0] ;
         Gx_msg = httpContext.getMessage( "Atencion¡¡¡, este Partido: ", "") + AV13PartCod + httpContext.getMessage( " del Cliente: ", "") + GXutil.str( A252CliCod, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( "ya existe en el Nº Reclamacion = ", "") + GXutil.str( A5198Nr_codigo, 8, 0) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnotrep.this.A396EmprCod;
      this.aP1[0] = pnotrep.this.A966PartCod;
      this.aP2[0] = pnotrep.this.A252CliCod;
      this.aP3[0] = pnotrep.this.AV12CliNom;
      this.aP4[0] = pnotrep.this.AV14Nr_albent;
      this.aP5[0] = pnotrep.this.AV15Nr_artcod;
      this.aP6[0] = pnotrep.this.AV16Nr_artdsc;
      this.aP7[0] = pnotrep.this.AV17Nr_piezas;
      this.aP8[0] = pnotrep.this.AV19Nr_kilos;
      this.aP9[0] = pnotrep.this.AV18Nr_unidad;
      this.aP10[0] = pnotrep.this.AV20Nr_ParNMtr;
      this.aP11[0] = pnotrep.this.AV10Ctrl_r;
      this.aP12[0] = pnotrep.this.Gx_msg;
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
      P02RF3_A396EmprCod = new String[] {""} ;
      P02RF3_A966PartCod = new String[] {""} ;
      P02RF3_A252CliCod = new int[1] ;
      P02RF3_A279CliNom = new String[] {""} ;
      P02RF3_A1456ParArtCod = new String[] {""} ;
      P02RF3_n1456ParArtCod = new boolean[] {false} ;
      P02RF3_A2240PartDsc = new String[] {""} ;
      P02RF3_n2240PartDsc = new boolean[] {false} ;
      P02RF3_A1457ParNMtr = new String[] {""} ;
      P02RF3_n1457ParNMtr = new boolean[] {false} ;
      P02RF3_A2244PartReo = new String[] {""} ;
      P02RF3_n2244PartReo = new boolean[] {false} ;
      P02RF3_A973PartKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02RF3_A974PartConEnt = new int[1] ;
      A279CliNom = "" ;
      A1456ParArtCod = "" ;
      A2240PartDsc = "" ;
      A1457ParNMtr = "" ;
      A2244PartReo = "" ;
      A973PartKilEnt = DecimalUtil.ZERO ;
      P02RF4_A396EmprCod = new String[] {""} ;
      P02RF4_A966PartCod = new String[] {""} ;
      P02RF4_A252CliCod = new int[1] ;
      P02RF4_A980PartLinTip = new String[] {""} ;
      P02RF4_n980PartLinTip = new boolean[] {false} ;
      P02RF4_A981PartAlbDis = new int[1] ;
      P02RF4_n981PartAlbDis = new boolean[] {false} ;
      P02RF4_A979PartLin = new int[1] ;
      A980PartLinTip = "" ;
      AV13PartCod = "" ;
      P02RF5_A396EmprCod = new String[] {""} ;
      P02RF5_A7090Nr_PartCod = new String[] {""} ;
      P02RF5_n7090Nr_PartCod = new boolean[] {false} ;
      P02RF5_A5340Nr_CliCod = new int[1] ;
      P02RF5_n5340Nr_CliCod = new boolean[] {false} ;
      P02RF5_A5198Nr_codigo = new int[1] ;
      A7090Nr_PartCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnotrep__default(),
         new Object[] {
             new Object[] {
            P02RF3_A396EmprCod, P02RF3_A966PartCod, P02RF3_A252CliCod, P02RF3_A279CliNom, P02RF3_A1456ParArtCod, P02RF3_n1456ParArtCod, P02RF3_A2240PartDsc, P02RF3_n2240PartDsc, P02RF3_A1457ParNMtr, P02RF3_n1457ParNMtr,
            P02RF3_A2244PartReo, P02RF3_n2244PartReo, P02RF3_A973PartKilEnt, P02RF3_A974PartConEnt
            }
            , new Object[] {
            P02RF4_A396EmprCod, P02RF4_A966PartCod, P02RF4_A252CliCod, P02RF4_A980PartLinTip, P02RF4_n980PartLinTip, P02RF4_A981PartAlbDis, P02RF4_n981PartAlbDis, P02RF4_A979PartLin
            }
            , new Object[] {
            P02RF5_A396EmprCod, P02RF5_A7090Nr_PartCod, P02RF5_n7090Nr_PartCod, P02RF5_A5340Nr_CliCod, P02RF5_n5340Nr_CliCod, P02RF5_A5198Nr_codigo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Ctrl_r ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV17Nr_piezas ;
   private int A974PartConEnt ;
   private int A981PartAlbDis ;
   private int A979PartLin ;
   private int A5340Nr_CliCod ;
   private int A5198Nr_codigo ;
   private java.math.BigDecimal AV19Nr_kilos ;
   private java.math.BigDecimal A973PartKilEnt ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String AV12CliNom ;
   private String AV14Nr_albent ;
   private String AV15Nr_artcod ;
   private String AV16Nr_artdsc ;
   private String AV18Nr_unidad ;
   private String AV20Nr_ParNMtr ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A1456ParArtCod ;
   private String A2240PartDsc ;
   private String A1457ParNMtr ;
   private String A2244PartReo ;
   private String A980PartLinTip ;
   private String AV13PartCod ;
   private String A7090Nr_PartCod ;
   private boolean n1456ParArtCod ;
   private boolean n2240PartDsc ;
   private boolean n1457ParNMtr ;
   private boolean n2244PartReo ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean returnInSub ;
   private boolean n7090Nr_PartCod ;
   private boolean n5340Nr_CliCod ;
   private String[] aP12 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P02RF3_A396EmprCod ;
   private String[] P02RF3_A966PartCod ;
   private int[] P02RF3_A252CliCod ;
   private String[] P02RF3_A279CliNom ;
   private String[] P02RF3_A1456ParArtCod ;
   private boolean[] P02RF3_n1456ParArtCod ;
   private String[] P02RF3_A2240PartDsc ;
   private boolean[] P02RF3_n2240PartDsc ;
   private String[] P02RF3_A1457ParNMtr ;
   private boolean[] P02RF3_n1457ParNMtr ;
   private String[] P02RF3_A2244PartReo ;
   private boolean[] P02RF3_n2244PartReo ;
   private java.math.BigDecimal[] P02RF3_A973PartKilEnt ;
   private int[] P02RF3_A974PartConEnt ;
   private String[] P02RF4_A396EmprCod ;
   private String[] P02RF4_A966PartCod ;
   private int[] P02RF4_A252CliCod ;
   private String[] P02RF4_A980PartLinTip ;
   private boolean[] P02RF4_n980PartLinTip ;
   private int[] P02RF4_A981PartAlbDis ;
   private boolean[] P02RF4_n981PartAlbDis ;
   private int[] P02RF4_A979PartLin ;
   private String[] P02RF5_A396EmprCod ;
   private String[] P02RF5_A7090Nr_PartCod ;
   private boolean[] P02RF5_n7090Nr_PartCod ;
   private int[] P02RF5_A5340Nr_CliCod ;
   private boolean[] P02RF5_n5340Nr_CliCod ;
   private int[] P02RF5_A5198Nr_codigo ;
}

final  class pnotrep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RF3", "SELECT T1.EmprCod, T1.PartCod, T1.CliCod, T2.CliNom, T1.ParArtCod, T1.PartDsc, T1.ParNMtr, T1.PartReo, COALESCE( T3.PartKilEnt, 0) AS PartKilEnt, COALESCE( T3.PartConEnt, 0) AS PartConEnt FROM ((TXPCPARTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(KilEnt) AS PartKilEnt, EmprCod, PartCod, CliCod, SUM(ConEnt) AS PartConEnt FROM TXPLPARTI GROUP BY EmprCod, PartCod, CliCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T1.PartCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.PartCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.PartCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02RF4", "SELECT EmprCod, PartCod, CliCod, PartLinTip, PartAlbDis, PartLin FROM TXPLPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod, PartLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02RF5", "SELECT EmprCod, Nr_PartCod, Nr_CliCod, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? and Nr_PartCod = ? and Nr_CliCod = ? ORDER BY EmprCod, Nr_PartCod, Nr_CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

