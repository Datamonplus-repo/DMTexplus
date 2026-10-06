package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionmaquinasfases extends GXProcedure
{
   public dpproduccionmaquinasfases( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionmaquinasfases.class ), "" );
   }

   public dpproduccionmaquinasfases( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTProduccionMaquinasFases> executeUdp( String aP0 ,
                                                                          String aP1 ,
                                                                          String aP2 ,
                                                                          java.util.Date aP3 ,
                                                                          java.util.Date aP4 )
   {
      dpproduccionmaquinasfases.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTProduccionMaquinasFases>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        GXBaseCollection<app.SdtSDTProduccionMaquinasFases>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             GXBaseCollection<app.SdtSDTProduccionMaquinasFases>[] aP5 )
   {
      dpproduccionmaquinasfases.this.AV10Emprcod = aP0;
      dpproduccionmaquinasfases.this.AV17MaqCodInicial = aP1;
      dpproduccionmaquinasfases.this.AV16MaqCodFinal = aP2;
      dpproduccionmaquinasfases.this.AV6Hisprodti = aP3;
      dpproduccionmaquinasfases.this.AV5Hisprodtf = aP4;
      dpproduccionmaquinasfases.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00142 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV17MaqCodInicial, AV6Hisprodti, AV5Hisprodtf, AV16MaqCodFinal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk142 = false ;
         A1525HisProKgr = P00142_A1525HisProKgr[0] ;
         A1526HisProMtr = P00142_A1526HisProMtr[0] ;
         A602MaqCod = P00142_A602MaqCod[0] ;
         A461Fase = P00142_A461Fase[0] ;
         A396EmprCod = P00142_A396EmprCod[0] ;
         A606MaqDsc = P00142_A606MaqDsc[0] ;
         n606MaqDsc = P00142_n606MaqDsc[0] ;
         A4440HisProDTI = P00142_A4440HisProDTI[0] ;
         n4440HisProDTI = P00142_n4440HisProDTI[0] ;
         A4441HisProDTF = P00142_A4441HisProDTF[0] ;
         n4441HisProDTF = P00142_n4441HisProDTF[0] ;
         A558HisProFec = P00142_A558HisProFec[0] ;
         A561HisProLin = P00142_A561HisProLin[0] ;
         A606MaqDsc = P00142_A606MaqDsc[0] ;
         n606MaqDsc = P00142_n606MaqDsc[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         Gxm1sdtproduccionmaquinasfases = (app.SdtSDTProduccionMaquinasFases)new app.SdtSDTProduccionMaquinasFases(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtproduccionmaquinasfases, 0);
         Gxm1sdtproduccionmaquinasfases.setgxTv_SdtSDTProduccionMaquinasFases_Maqdsc( A606MaqDsc );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00142_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00142_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk142 = false ;
            A1525HisProKgr = P00142_A1525HisProKgr[0] ;
            A1526HisProMtr = P00142_A1526HisProMtr[0] ;
            A461Fase = P00142_A461Fase[0] ;
            A4440HisProDTI = P00142_A4440HisProDTI[0] ;
            n4440HisProDTI = P00142_n4440HisProDTI[0] ;
            A4441HisProDTF = P00142_A4441HisProDTF[0] ;
            n4441HisProDTF = P00142_n4441HisProDTF[0] ;
            A558HisProFec = P00142_A558HisProFec[0] ;
            A561HisProLin = P00142_A561HisProLin[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
            }
            Gxm3sdtproduccionmaquinasfases_fases = (app.SdtSDTProduccionMaquinasFases_FasesItem)new app.SdtSDTProduccionMaquinasFases_FasesItem(remoteHandle, context);
            Gxm1sdtproduccionmaquinasfases.getgxTv_SdtSDTProduccionMaquinasFases_Fases().add(Gxm3sdtproduccionmaquinasfases_fases, 0);
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
            dpproduccionmaquinasfases.this.GXt_char1 = GXv_char2[0] ;
            Gxm3sdtproduccionmaquinasfases_fases.setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Fasdsc( GXt_char1 );
            AV7Kilos = DecimalUtil.doubleToDec(0) ;
            AV8Metros = DecimalUtil.doubleToDec(0) ;
            AV9Tiempo = (short)(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00142_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00142_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(P00142_A461Fase[0], A461Fase) == 0 ) )
            {
               brk142 = false ;
               A1525HisProKgr = P00142_A1525HisProKgr[0] ;
               A1526HisProMtr = P00142_A1526HisProMtr[0] ;
               A4440HisProDTI = P00142_A4440HisProDTI[0] ;
               n4440HisProDTI = P00142_n4440HisProDTI[0] ;
               A4441HisProDTF = P00142_A4441HisProDTF[0] ;
               n4441HisProDTF = P00142_n4441HisProDTF[0] ;
               A558HisProFec = P00142_A558HisProFec[0] ;
               A561HisProLin = P00142_A561HisProLin[0] ;
               if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
               {
                  A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
               }
               else
               {
                  A5605HisProTr2 = (short)(0) ;
               }
               AV7Kilos = AV7Kilos.add(A1525HisProKgr) ;
               AV8Metros = AV8Metros.add(A1526HisProMtr) ;
               AV9Tiempo = (short)(AV9Tiempo+A5605HisProTr2) ;
               brk142 = true ;
               pr_default.readNext(0);
            }
            Gxm3sdtproduccionmaquinasfases_fases.setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Tiempo( AV9Tiempo );
            Gxm3sdtproduccionmaquinasfases_fases.setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Kilosproduccion( AV7Kilos );
            Gxm3sdtproduccionmaquinasfases_fases.setgxTv_SdtSDTProduccionMaquinasFases_FasesItem_Metrosproduccion( AV8Metros );
            if ( ! brk142 )
            {
               brk142 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk142 )
         {
            brk142 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpproduccionmaquinasfases.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTProduccionMaquinasFases>(app.SdtSDTProduccionMaquinasFases.class, "SDTProduccionMaquinasFases", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00142_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00142_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00142_A602MaqCod = new String[] {""} ;
      P00142_A461Fase = new String[] {""} ;
      P00142_A396EmprCod = new String[] {""} ;
      P00142_A606MaqDsc = new String[] {""} ;
      P00142_n606MaqDsc = new boolean[] {false} ;
      P00142_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P00142_n4440HisProDTI = new boolean[] {false} ;
      P00142_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P00142_n4441HisProDTF = new boolean[] {false} ;
      P00142_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00142_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A461Fase = "" ;
      A396EmprCod = "" ;
      A606MaqDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtproduccionmaquinasfases = new app.SdtSDTProduccionMaquinasFases(remoteHandle, context);
      Gxm3sdtproduccionmaquinasfases_fases = new app.SdtSDTProduccionMaquinasFases_FasesItem(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV7Kilos = DecimalUtil.ZERO ;
      AV8Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionmaquinasfases__default(),
         new Object[] {
             new Object[] {
            P00142_A1525HisProKgr, P00142_A1526HisProMtr, P00142_A602MaqCod, P00142_A461Fase, P00142_A396EmprCod, P00142_A606MaqDsc, P00142_n606MaqDsc, P00142_A4440HisProDTI, P00142_n4440HisProDTI, P00142_A4441HisProDTF,
            P00142_n4441HisProDTF, P00142_A558HisProFec, P00142_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5605HisProTr2 ;
   private short AV9Tiempo ;
   private short Gx_err ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV7Kilos ;
   private java.math.BigDecimal AV8Metros ;
   private String AV10Emprcod ;
   private String AV17MaqCodInicial ;
   private String AV16MaqCodFinal ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV6Hisprodti ;
   private java.util.Date AV5Hisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk142 ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private GXBaseCollection<app.SdtSDTProduccionMaquinasFases>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00142_A1525HisProKgr ;
   private java.math.BigDecimal[] P00142_A1526HisProMtr ;
   private String[] P00142_A602MaqCod ;
   private String[] P00142_A461Fase ;
   private String[] P00142_A396EmprCod ;
   private String[] P00142_A606MaqDsc ;
   private boolean[] P00142_n606MaqDsc ;
   private java.util.Date[] P00142_A4440HisProDTI ;
   private boolean[] P00142_n4440HisProDTI ;
   private java.util.Date[] P00142_A4441HisProDTF ;
   private boolean[] P00142_n4441HisProDTF ;
   private java.util.Date[] P00142_A558HisProFec ;
   private int[] P00142_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTProduccionMaquinasFases> Gxm2rootcol ;
   private app.SdtSDTProduccionMaquinasFases Gxm1sdtproduccionmaquinasfases ;
   private app.SdtSDTProduccionMaquinasFases_FasesItem Gxm3sdtproduccionmaquinasfases_fases ;
}

final  class dpproduccionmaquinasfases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00142", "SELECT T1.HisProKgr, T1.HisProMtr, T1.MaqCod, T1.Fase, T1.EmprCod, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.Fase ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

