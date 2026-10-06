package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionhdrscv_dp extends GXProcedure
{
   public impresionhdrscv_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionhdrscv_dp.class ), "" );
   }

   public impresionhdrscv_dp( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtImpresionHdrCv_SDT> executeUdp( String aP0 ,
                                                                  int aP1 ,
                                                                  byte aP2 ,
                                                                  String aP3 ,
                                                                  int aP4 ,
                                                                  byte aP5 ,
                                                                  String aP6 ,
                                                                  java.util.Date aP7 ,
                                                                  java.util.Date aP8 ,
                                                                  byte aP9 ,
                                                                  String aP10 )
   {
      impresionhdrscv_dp.this.aP11 = new GXBaseCollection[] {new GXBaseCollection<app.SdtImpresionHdrCv_SDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        String aP6 ,
                        java.util.Date aP7 ,
                        java.util.Date aP8 ,
                        byte aP9 ,
                        String aP10 ,
                        GXBaseCollection<app.SdtImpresionHdrCv_SDT>[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String aP6 ,
                             java.util.Date aP7 ,
                             java.util.Date aP8 ,
                             byte aP9 ,
                             String aP10 ,
                             GXBaseCollection<app.SdtImpresionHdrCv_SDT>[] aP11 )
   {
      impresionhdrscv_dp.this.AV5Emprcod = aP0;
      impresionhdrscv_dp.this.AV14Barcod = aP1;
      impresionhdrscv_dp.this.AV15Barcodreo = aP2;
      impresionhdrscv_dp.this.AV13Barcodpar = aP3;
      impresionhdrscv_dp.this.AV16Barcod_to = aP4;
      impresionhdrscv_dp.this.AV17Barcodreo_to = aP5;
      impresionhdrscv_dp.this.AV18Barcodpar_to = aP6;
      impresionhdrscv_dp.this.AV6BarFecGen = aP7;
      impresionhdrscv_dp.this.AV8BarFecGen_to = aP8;
      impresionhdrscv_dp.this.AV7BarLis = aP9;
      impresionhdrscv_dp.this.AV19InBarEncCli = aP10;
      impresionhdrscv_dp.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002E2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6BarFecGen, AV8BarFecGen_to, Integer.valueOf(AV14Barcod), Byte.valueOf(AV15Barcodreo), AV13Barcodpar, Integer.valueOf(AV16Barcod_to), Byte.valueOf(AV17Barcodreo_to), AV18Barcodpar_to, AV19InBarEncCli, AV19InBarEncCli, Byte.valueOf(AV7BarLis)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk2E2 = false ;
         A396EmprCod = P002E2_A396EmprCod[0] ;
         A178BarLis = P002E2_A178BarLis[0] ;
         A4812BarEncCli = P002E2_A4812BarEncCli[0] ;
         A130BarCodPar = P002E2_A130BarCodPar[0] ;
         A132BarCodReo = P002E2_A132BarCodReo[0] ;
         A129BarCod = P002E2_A129BarCod[0] ;
         A159BarFecGen = P002E2_A159BarFecGen[0] ;
         A252CliCod = P002E2_A252CliCod[0] ;
         n252CliCod = P002E2_n252CliCod[0] ;
         A279CliNom = P002E2_A279CliNom[0] ;
         A279CliNom = P002E2_A279CliNom[0] ;
         Gxm1impresionhdrcv_sdt = (app.SdtImpresionHdrCv_SDT)new app.SdtImpresionHdrCv_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1impresionhdrcv_sdt, 0);
         Gxm1impresionhdrcv_sdt.setgxTv_SdtImpresionHdrCv_SDT_Clicod( A252CliCod );
         Gxm1impresionhdrcv_sdt.setgxTv_SdtImpresionHdrCv_SDT_Clinom( A279CliNom );
         Gxm1impresionhdrcv_sdt.setgxTv_SdtImpresionHdrCv_SDT_Barenccli( A4812BarEncCli );
         AV9NumeroHdrs = (short)(0) ;
         AV10RelacionHdrs = "" ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P002E2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P002E2_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P002E2_A4812BarEncCli[0], A4812BarEncCli) == 0 ) )
         {
            brk2E2 = false ;
            A178BarLis = P002E2_A178BarLis[0] ;
            A130BarCodPar = P002E2_A130BarCodPar[0] ;
            A132BarCodReo = P002E2_A132BarCodReo[0] ;
            A129BarCod = P002E2_A129BarCod[0] ;
            A159BarFecGen = P002E2_A159BarFecGen[0] ;
            if ( ( GXutil.strcmp(A4812BarEncCli, AV19InBarEncCli) == 0 ) || (GXutil.strcmp("", AV19InBarEncCli)==0) )
            {
               if ( GXutil.strcmp(A396EmprCod, AV5Emprcod) == 0 )
               {
                  if ( (( GXutil.resetTime(A159BarFecGen).after( GXutil.resetTime( AV6BarFecGen )) ) || ( GXutil.dateCompare(GXutil.resetTime(A159BarFecGen), GXutil.resetTime(AV6BarFecGen)) )) )
                  {
                     if ( (( GXutil.resetTime(A159BarFecGen).before( GXutil.resetTime( AV8BarFecGen_to )) ) || ( GXutil.dateCompare(GXutil.resetTime(A159BarFecGen), GXutil.resetTime(AV8BarFecGen_to)) )) )
                     {
                        if ( A129BarCod >= AV14Barcod )
                        {
                           if ( A132BarCodReo >= AV15Barcodreo )
                           {
                              if ( GXutil.strcmp(A130BarCodPar, AV13Barcodpar) >= 0 )
                              {
                                 if ( A129BarCod <= AV16Barcod_to )
                                 {
                                    if ( A132BarCodReo <= AV17Barcodreo_to )
                                    {
                                       if ( GXutil.strcmp(A130BarCodPar, AV18Barcodpar_to) <= 0 )
                                       {
                                          if ( A178BarLis == AV7BarLis )
                                          {
                                             AV9NumeroHdrs = (short)(AV9NumeroHdrs+1) ;
                                             AV10RelacionHdrs = ((GXutil.strcmp("", AV10RelacionHdrs)==0) ? GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 8, 0)), (short)(8), "0")+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar : AV10RelacionHdrs+GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 8, 0)), (short)(8), "0")+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar) ;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            brk2E2 = true ;
            pr_default.readNext(0);
         }
         Gxm1impresionhdrcv_sdt.getgxTv_SdtImpresionHdrCv_SDT_Numero().setgxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs( AV9NumeroHdrs );
         Gxm1impresionhdrcv_sdt.getgxTv_SdtImpresionHdrCv_SDT_Numero().setgxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs( AV10RelacionHdrs );
         if ( ! brk2E2 )
         {
            brk2E2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP11[0] = impresionhdrscv_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtImpresionHdrCv_SDT>(app.SdtImpresionHdrCv_SDT.class, "ImpresionHdrCv_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P002E2_A396EmprCod = new String[] {""} ;
      P002E2_A178BarLis = new byte[1] ;
      P002E2_A4812BarEncCli = new String[] {""} ;
      P002E2_A130BarCodPar = new String[] {""} ;
      P002E2_A132BarCodReo = new byte[1] ;
      P002E2_A129BarCod = new int[1] ;
      P002E2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P002E2_A252CliCod = new int[1] ;
      P002E2_n252CliCod = new boolean[] {false} ;
      P002E2_A279CliNom = new String[] {""} ;
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A279CliNom = "" ;
      Gxm1impresionhdrcv_sdt = new app.SdtImpresionHdrCv_SDT(remoteHandle, context);
      AV10RelacionHdrs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.impresionhdrscv_dp__default(),
         new Object[] {
             new Object[] {
            P002E2_A396EmprCod, P002E2_A178BarLis, P002E2_A4812BarEncCli, P002E2_A130BarCodPar, P002E2_A132BarCodReo, P002E2_A129BarCod, P002E2_A159BarFecGen, P002E2_A252CliCod, P002E2_n252CliCod, P002E2_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Barcodreo ;
   private byte AV17Barcodreo_to ;
   private byte AV7BarLis ;
   private byte A178BarLis ;
   private byte A132BarCodReo ;
   private short AV9NumeroHdrs ;
   private short Gx_err ;
   private int AV14Barcod ;
   private int AV16Barcod_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private String AV5Emprcod ;
   private String AV13Barcodpar ;
   private String AV18Barcodpar_to ;
   private String AV19InBarEncCli ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private java.util.Date AV6BarFecGen ;
   private java.util.Date AV8BarFecGen_to ;
   private java.util.Date A159BarFecGen ;
   private boolean brk2E2 ;
   private boolean n252CliCod ;
   private String AV10RelacionHdrs ;
   private GXBaseCollection<app.SdtImpresionHdrCv_SDT>[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P002E2_A396EmprCod ;
   private byte[] P002E2_A178BarLis ;
   private String[] P002E2_A4812BarEncCli ;
   private String[] P002E2_A130BarCodPar ;
   private byte[] P002E2_A132BarCodReo ;
   private int[] P002E2_A129BarCod ;
   private java.util.Date[] P002E2_A159BarFecGen ;
   private int[] P002E2_A252CliCod ;
   private boolean[] P002E2_n252CliCod ;
   private String[] P002E2_A279CliNom ;
   private GXBaseCollection<app.SdtImpresionHdrCv_SDT> Gxm2rootcol ;
   private app.SdtImpresionHdrCv_SDT Gxm1impresionhdrcv_sdt ;
}

final  class impresionhdrscv_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002E2", "SELECT T1.EmprCod, T1.BarLis, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFecGen, T1.CliCod, T2.CliNom FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.BarFecGen >= ?) AND (T1.BarFecGen <= ?) AND (T1.BarCod >= ?) AND (T1.BarCodReo >= ?) AND (T1.BarCodPar >= ?) AND (T1.BarCod <= ?) AND (T1.BarCodReo <= ?) AND (T1.BarCodPar <= ?) AND (T1.BarEncCli = ? or (rtrim(?) IS NULL)) AND (T1.BarLis = ?) ORDER BY T1.EmprCod, T1.CliCod, T1.BarEncCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 20);
               stmt.setString(11, (String)parms[10], 20);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               return;
      }
   }

}

