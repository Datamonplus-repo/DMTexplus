package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoscor extends GXProcedure
{
   public pcoscor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoscor.class ), "" );
   }

   public pcoscor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      pcoscor.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pcoscor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoscor.this.A910Workstat = aP1[0];
      this.aP1 = aP1;
      pcoscor.this.AV8Coste_Cor = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcoscor.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      pcoscor.this.A396EmprCod = GXv_char2[0] ;
      pcoscor.this.AV11EmprNom = GXv_char3[0] ;
      pcoscor.this.AV12UsurCod = GXv_char4[0] ;
      AV17ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV17ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV17ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV17ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV17ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso 2...", ""));
      AV17ProgressIndicator.show();
      AV18CantidadRegistrosAProcesar = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P019E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat});
      cV18CantidadRegistrosAProcesar = P019E2_AV18CantidadRegistrosAProcesar[0] ;
      pr_default.close(0);
      AV18CantidadRegistrosAProcesar = (short)(AV18CantidadRegistrosAProcesar+cV18CantidadRegistrosAProcesar*1) ;
      /* End optimized group. */
      if ( AV18CantidadRegistrosAProcesar == 0 )
      {
         AV18CantidadRegistrosAProcesar = (short)(1) ;
      }
      AV8Coste_Cor = DecimalUtil.doubleToDec(0) ;
      AV9Lb_costec = DecimalUtil.doubleToDec(0) ;
      AV19CantidadRegistrosProcesados = (short)(0) ;
      /* Using cursor P019E3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A891EscMCos = P019E3_A891EscMCos[0] ;
         A719PrdNum = P019E3_A719PrdNum[0] ;
         A764ProForCod = P019E3_A764ProForCod[0] ;
         A4712EscMFacCon = P019E3_A4712EscMFacCon[0] ;
         A890EscMCan = P019E3_A890EscMCan[0] ;
         A889EscMPrdPre = P019E3_A889EscMPrdPre[0] ;
         A4713EscMRb = P019E3_A4713EscMRb[0] ;
         A718PrdNom = P019E3_A718PrdNom[0] ;
         A887EscMLin = P019E3_A887EscMLin[0] ;
         A718PrdNom = P019E3_A718PrdNom[0] ;
         AV8Coste_Cor = AV8Coste_Cor.add(A891EscMCos) ;
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
         {
            AV9Lb_costec = AV9Lb_costec.add(A891EscMCos) ;
         }
         AV13Inc_obs = httpContext.getMessage( "Coste Ensayo.", "") + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Station = ", "") + GXutil.trim( A910Workstat) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Linea   = ", "") + GXutil.str( A887EscMLin, 8, 0) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Proceso = ", "") + GXutil.trim( A764ProForCod) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Producto= ", "") + GXutil.trim( A719PrdNum) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Factor  = ", "") + GXutil.str( A4712EscMFacCon, 12, 5) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Cantidad= ", "") + GXutil.str( A890EscMCan, 11, 4) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Precio  = ", "") + GXutil.str( A889EscMPrdPre, 14, 5) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Coste   = ", "") + GXutil.str( A891EscMCos, 15, 5) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Rb      = ", "") + GXutil.str( A4713EscMRb, 4, 0) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV12UsurCod, AV10Station, AV13Inc_obs, AV16Lb_numero, (byte)(0), " ") ;
         AV19CantidadRegistrosProcesados = (short)(AV19CantidadRegistrosProcesados+1) ;
         AV20Porcentaje = (short)((AV19CantidadRegistrosProcesados/ (double) (AV18CantidadRegistrosAProcesar))*100) ;
         AV17ProgressIndicator.setgxTv_SdtProgress_Value( AV20Porcentaje );
         AV17ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV19CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV18CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( A719PrdNum), GXutil.trim( A718PrdNom), "", "", "", "", ""));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV17ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso 2 finalizado.", ""));
      AV17ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV17ProgressIndicator.hide();
      AV17ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV17ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV17ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV17ProgressIndicator.setgxTv_SdtProgress_Maxvalue( 100 );
      AV17ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso 3...", ""));
      AV17ProgressIndicator.show();
      AV19CantidadRegistrosProcesados = (short)(0) ;
      /* Using cursor P019E4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A910Workstat});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A718PrdNom = P019E4_A718PrdNom[0] ;
         A719PrdNum = P019E4_A719PrdNum[0] ;
         A887EscMLin = P019E4_A887EscMLin[0] ;
         A718PrdNom = P019E4_A718PrdNom[0] ;
         AV19CantidadRegistrosProcesados = (short)(AV19CantidadRegistrosProcesados+1) ;
         AV20Porcentaje = (short)((AV19CantidadRegistrosProcesados/ (double) (AV18CantidadRegistrosAProcesar))*100) ;
         AV17ProgressIndicator.setgxTv_SdtProgress_Value( AV20Porcentaje );
         AV17ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Eliminando %1 de %2 (%3-%4).", ""), GXutil.trim( GXutil.str( AV19CantidadRegistrosProcesados, 4, 0)), GXutil.trim( GXutil.str( AV18CantidadRegistrosAProcesar, 4, 0)), GXutil.trim( A719PrdNum), GXutil.trim( A718PrdNom), "", "", "", "", ""));
         /* Using cursor P019E5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV17ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso 3 finalizado.", ""));
      AV17ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV17ProgressIndicator.hide();
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoscor.this.A396EmprCod;
      this.aP1[0] = pcoscor.this.A910Workstat;
      this.aP2[0] = pcoscor.this.AV8Coste_Cor;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcoscor");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV17ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      P019E2_AV18CantidadRegistrosAProcesar = new short[1] ;
      AV9Lb_costec = DecimalUtil.ZERO ;
      P019E3_A396EmprCod = new String[] {""} ;
      P019E3_A910Workstat = new String[] {""} ;
      P019E3_A891EscMCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019E3_A719PrdNum = new String[] {""} ;
      P019E3_A764ProForCod = new String[] {""} ;
      P019E3_A4712EscMFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019E3_A890EscMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019E3_A889EscMPrdPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019E3_A4713EscMRb = new short[1] ;
      P019E3_A718PrdNom = new String[] {""} ;
      P019E3_A887EscMLin = new int[1] ;
      A891EscMCos = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A764ProForCod = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV13Inc_obs = "" ;
      AV25Pgmname = "" ;
      P019E4_A396EmprCod = new String[] {""} ;
      P019E4_A910Workstat = new String[] {""} ;
      P019E4_A718PrdNom = new String[] {""} ;
      P019E4_A719PrdNum = new String[] {""} ;
      P019E4_A887EscMLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoscor__default(),
         new Object[] {
             new Object[] {
            P019E2_AV18CantidadRegistrosAProcesar
            }
            , new Object[] {
            P019E3_A396EmprCod, P019E3_A910Workstat, P019E3_A891EscMCos, P019E3_A719PrdNum, P019E3_A764ProForCod, P019E3_A4712EscMFacCon, P019E3_A890EscMCan, P019E3_A889EscMPrdPre, P019E3_A4713EscMRb, P019E3_A718PrdNom,
            P019E3_A887EscMLin
            }
            , new Object[] {
            P019E4_A396EmprCod, P019E4_A910Workstat, P019E4_A718PrdNom, P019E4_A719PrdNum, P019E4_A887EscMLin
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "PCOSCOR" ;
      /* GeneXus formulas. */
      AV25Pgmname = "PCOSCOR" ;
      Gx_err = (short)(0) ;
   }

   private short AV18CantidadRegistrosAProcesar ;
   private short cV18CantidadRegistrosAProcesar ;
   private short AV19CantidadRegistrosProcesados ;
   private short A4713EscMRb ;
   private short AV20Porcentaje ;
   private short Gx_err ;
   private int A887EscMLin ;
   private int AV16Lb_numero ;
   private java.math.BigDecimal AV8Coste_Cor ;
   private java.math.BigDecimal AV9Lb_costec ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal A889EscMPrdPre ;
   private String A396EmprCod ;
   private String A910Workstat ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV12UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A764ProForCod ;
   private String A718PrdNom ;
   private String AV25Pgmname ;
   private String AV13Inc_obs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV17ProgressIndicator ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P019E2_AV18CantidadRegistrosAProcesar ;
   private String[] P019E3_A396EmprCod ;
   private String[] P019E3_A910Workstat ;
   private java.math.BigDecimal[] P019E3_A891EscMCos ;
   private String[] P019E3_A719PrdNum ;
   private String[] P019E3_A764ProForCod ;
   private java.math.BigDecimal[] P019E3_A4712EscMFacCon ;
   private java.math.BigDecimal[] P019E3_A890EscMCan ;
   private java.math.BigDecimal[] P019E3_A889EscMPrdPre ;
   private short[] P019E3_A4713EscMRb ;
   private String[] P019E3_A718PrdNom ;
   private int[] P019E3_A887EscMLin ;
   private String[] P019E4_A396EmprCod ;
   private String[] P019E4_A910Workstat ;
   private String[] P019E4_A718PrdNom ;
   private String[] P019E4_A719PrdNum ;
   private int[] P019E4_A887EscMLin ;
}

final  class pcoscor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019E2", "SELECT COUNT(*) FROM TXPESCMAN WHERE EmprCod = ? and Workstat = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P019E3", "SELECT T1.EmprCod, T1.Workstat, T1.EscMCos, T1.PrdNum, T1.ProForCod, T1.EscMFacCon, T1.EscMCan, T1.EscMPrdPre, T1.EscMRb, T2.PrdNom, T1.EscMLin FROM (TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P019E4", "SELECT T1.EmprCod, T1.Workstat, T2.PrdNom, T1.PrdNum, T1.EscMLin FROM (TXPESCMAN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Workstat = ? ORDER BY T1.EmprCod, T1.Workstat, T1.EscMLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019E5", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? AND Workstat = ? AND EscMLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

