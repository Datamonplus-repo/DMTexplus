package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpconsultamaquinas extends GXProcedure
{
   public dpconsultamaquinas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpconsultamaquinas.class ), "" );
   }

   public dpconsultamaquinas( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTConsultaMaquina> executeUdp( String aP0 )
   {
      dpconsultamaquinas.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTConsultaMaquina>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.SdtSDTConsultaMaquina>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.SdtSDTConsultaMaquina>[] aP1 )
   {
      dpconsultamaquinas.this.AV8EmprCod = aP0;
      dpconsultamaquinas.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000A3 */
      pr_default.execute(0, new Object[] {AV8EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk0A2 = false ;
         A9426OMMaqCod = P000A3_A9426OMMaqCod[0] ;
         n9426OMMaqCod = P000A3_n9426OMMaqCod[0] ;
         A396EmprCod = P000A3_A396EmprCod[0] ;
         A9425OMCod = P000A3_A9425OMCod[0] ;
         A9436OMFchCre = P000A3_A9436OMFchCre[0] ;
         A9445OMEst = P000A3_A9445OMEst[0] ;
         A13679OMMaqCodFo = P000A3_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P000A3_n13679OMMaqCodFo[0] ;
         A9427OMMaqDsc = P000A3_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P000A3_n9427OMMaqDsc[0] ;
         A9427OMMaqDsc = P000A3_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P000A3_n9427OMMaqDsc[0] ;
         A13679OMMaqCodFo = P000A3_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P000A3_n13679OMMaqCodFo[0] ;
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
            if ( (GXutil.strcmp("", A13679OMMaqCodFo)==0) )
            {
               A13678OMDscMqPla = A9427OMMaqDsc ;
            }
            else
            {
               A13678OMDscMqPla = A13679OMMaqCodFo ;
            }
            /* Using cursor P000A5 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n9426OMMaqCod), A9426OMMaqCod});
            if ( (pr_default.getStatus(1) != 101) )
            {
               A40000GXC1 = P000A5_A40000GXC1[0] ;
               n40000GXC1 = P000A5_n40000GXC1[0] ;
               A40001GXC2 = P000A5_A40001GXC2[0] ;
               n40001GXC2 = P000A5_n40001GXC2[0] ;
               A40002GXC3 = P000A5_A40002GXC3[0] ;
               n40002GXC3 = P000A5_n40002GXC3[0] ;
            }
            else
            {
               A40000GXC1 = GXutil.resetTime( GXutil.nullDate() );
               n40000GXC1 = false ;
               A40001GXC2 = GXutil.resetTime( GXutil.nullDate() );
               n40001GXC2 = false ;
               A40002GXC3 = 0 ;
               n40002GXC3 = false ;
            }
            pr_default.close(1);
            Gxm1sdtconsultamaquina = (app.SdtSDTConsultaMaquina)new app.SdtSDTConsultaMaquina(remoteHandle, context);
            Gxm2rootcol.add(Gxm1sdtconsultamaquina, 0);
            Gxm1sdtconsultamaquina.setgxTv_SdtSDTConsultaMaquina_Ommaqcod( A9426OMMaqCod );
            Gxm1sdtconsultamaquina.setgxTv_SdtSDTConsultaMaquina_Omdscmqpla( A13678OMDscMqPla );
            Gxm1sdtconsultamaquina.setgxTv_SdtSDTConsultaMaquina_Minimaomfchcre( A40000GXC1 );
            Gxm1sdtconsultamaquina.setgxTv_SdtSDTConsultaMaquina_Maximaomfchcre( A40001GXC2 );
            Gxm1sdtconsultamaquina.setgxTv_SdtSDTConsultaMaquina_Totalordenes( A40002GXC3 );
            AV7id = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P000A3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P000A3_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
            {
               brk0A2 = false ;
               A9425OMCod = P000A3_A9425OMCod[0] ;
               A9436OMFchCre = P000A3_A9436OMFchCre[0] ;
               A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
               Gxm3sdtconsultamaquina_ordenes = (app.SdtSDTConsultaMaquina_OrdenesItem)new app.SdtSDTConsultaMaquina_OrdenesItem(remoteHandle, context);
               Gxm1sdtconsultamaquina.getgxTv_SdtSDTConsultaMaquina_Ordenes().add(Gxm3sdtconsultamaquina_ordenes, 0);
               AV7id = (long)(AV7id+1) ;
               Gxm3sdtconsultamaquina_ordenes.setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Id( AV7id );
               Gxm3sdtconsultamaquina_ordenes.setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod( A9425OMCod );
               Gxm3sdtconsultamaquina_ordenes.setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre( A9436OMFchCre );
               Gxm3sdtconsultamaquina_ordenes.setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion( A13680OMDuracion );
               brk0A2 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk0A2 )
         {
            brk0A2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpconsultamaquinas.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTConsultaMaquina>(app.SdtSDTConsultaMaquina.class, "SDTConsultaMaquina", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000A3_A9426OMMaqCod = new String[] {""} ;
      P000A3_n9426OMMaqCod = new boolean[] {false} ;
      P000A3_A396EmprCod = new String[] {""} ;
      P000A3_A9425OMCod = new int[1] ;
      P000A3_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P000A3_A9445OMEst = new String[] {""} ;
      P000A3_A13679OMMaqCodFo = new String[] {""} ;
      P000A3_n13679OMMaqCodFo = new boolean[] {false} ;
      P000A3_A9427OMMaqDsc = new String[] {""} ;
      P000A3_n9427OMMaqDsc = new boolean[] {false} ;
      A9426OMMaqCod = "" ;
      A396EmprCod = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9445OMEst = "" ;
      A13679OMMaqCodFo = "" ;
      A9427OMMaqDsc = "" ;
      A13680OMDuracion = "" ;
      A13678OMDscMqPla = "" ;
      P000A5_A40000GXC1 = new java.util.Date[] {GXutil.nullDate()} ;
      P000A5_n40000GXC1 = new boolean[] {false} ;
      P000A5_A40001GXC2 = new java.util.Date[] {GXutil.nullDate()} ;
      P000A5_n40001GXC2 = new boolean[] {false} ;
      P000A5_A40002GXC3 = new int[1] ;
      P000A5_n40002GXC3 = new boolean[] {false} ;
      A40000GXC1 = GXutil.resetTime( GXutil.nullDate() );
      A40001GXC2 = GXutil.resetTime( GXutil.nullDate() );
      Gxm1sdtconsultamaquina = new app.SdtSDTConsultaMaquina(remoteHandle, context);
      Gxm3sdtconsultamaquina_ordenes = new app.SdtSDTConsultaMaquina_OrdenesItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpconsultamaquinas__default(),
         new Object[] {
             new Object[] {
            P000A3_A9426OMMaqCod, P000A3_A396EmprCod, P000A3_A9425OMCod, P000A3_A9436OMFchCre, P000A3_A9445OMEst, P000A3_A13679OMMaqCodFo, P000A3_n13679OMMaqCodFo, P000A3_A9427OMMaqDsc, P000A3_n9427OMMaqDsc
            }
            , new Object[] {
            P000A5_A40000GXC1, P000A5_n40000GXC1, P000A5_A40001GXC2, P000A5_n40001GXC2, P000A5_A40002GXC3, P000A5_n40002GXC3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A9425OMCod ;
   private int A40002GXC3 ;
   private long AV7id ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A9426OMMaqCod ;
   private String A396EmprCod ;
   private String A9445OMEst ;
   private String A13679OMMaqCodFo ;
   private String A9427OMMaqDsc ;
   private String A13678OMDscMqPla ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A40000GXC1 ;
   private java.util.Date A40001GXC2 ;
   private boolean brk0A2 ;
   private boolean n9426OMMaqCod ;
   private boolean n13679OMMaqCodFo ;
   private boolean n9427OMMaqDsc ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private boolean n40002GXC3 ;
   private String A13680OMDuracion ;
   private GXBaseCollection<app.SdtSDTConsultaMaquina>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000A3_A9426OMMaqCod ;
   private boolean[] P000A3_n9426OMMaqCod ;
   private String[] P000A3_A396EmprCod ;
   private int[] P000A3_A9425OMCod ;
   private java.util.Date[] P000A3_A9436OMFchCre ;
   private String[] P000A3_A9445OMEst ;
   private String[] P000A3_A13679OMMaqCodFo ;
   private boolean[] P000A3_n13679OMMaqCodFo ;
   private String[] P000A3_A9427OMMaqDsc ;
   private boolean[] P000A3_n9427OMMaqDsc ;
   private java.util.Date[] P000A5_A40000GXC1 ;
   private boolean[] P000A5_n40000GXC1 ;
   private java.util.Date[] P000A5_A40001GXC2 ;
   private boolean[] P000A5_n40001GXC2 ;
   private int[] P000A5_A40002GXC3 ;
   private boolean[] P000A5_n40002GXC3 ;
   private GXBaseCollection<app.SdtSDTConsultaMaquina> Gxm2rootcol ;
   private app.SdtSDTConsultaMaquina Gxm1sdtconsultamaquina ;
   private app.SdtSDTConsultaMaquina_OrdenesItem Gxm3sdtconsultamaquina_ordenes ;
}

final  class dpconsultamaquinas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000A3", "SELECT DISTINCT OMMaqCod, NULL AS EmprCod, NULL AS OMCod, NULL AS OMFchCre, NULL AS OMEst, NULL AS OMMaqCodFo, NULL AS OMMaqDsc FROM ( SELECT T1.OMMaqCod AS OMMaqCod, T1.EmprCod, T1.OMCod, T1.OMFchCre, T1.OMEst, COALESCE( T3.OMMaqCodFo, '') AS OMMaqCodFo, T2.MaqDsc AS OMMaqDsc FROM ((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN (SELECT T4.MaqCodFor AS OMMaqCodFo, T4.EmprCod, T5.OMCod, T4.MaqCod, T5.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T4 INNER JOIN TXPMORDEN T5 ON T5.EmprCod = T4.EmprCod) WHERE T4.MaqCod = T5.OMMaqCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.OMCod = T1.OMCod) WHERE (T1.EmprCod = ?) AND (Not (rtrim(T1.OMMaqCod) IS NULL AND NOT(T1.OMMaqCod IS NULL))) ORDER BY T1.EmprCod, T1.OMMaqCod) DistinctT ORDER BY OMMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000A5", "SELECT COALESCE( T1.GXC1, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS GXC1, COALESCE( T1.GXC2, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS GXC2, COALESCE( T1.GXC3, 0) AS GXC3 FROM (SELECT MIN(OMFchCre) AS GXC1, OMMaqCod, MAX(OMFchCre) AS GXC2, COUNT(*) AS GXC3 FROM TXPMORDEN GROUP BY OMMaqCod ) T1 WHERE T1.OMMaqCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               return;
      }
   }

}

