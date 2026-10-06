package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc242 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc242 pgm = new apprc242 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc242( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc242.class ), "" );
   }

   public apprc242( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV11EmprCod ;
      GXv_char2[0] = AV10EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc242.this.AV11EmprCod = GXv_char1[0] ;
      apprc242.this.AV10EmprNom = GXv_char2[0] ;
      apprc242.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P05VU2 */
      pr_default.execute(0, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P05VU2_A252CliCod[0] ;
         A396EmprCod = P05VU2_A396EmprCod[0] ;
         AV12Clicod = A252CliCod ;
         Gx_msg = httpContext.getMessage( "Procesando Cliente... ", "") + GXutil.str( AV12Clicod, 6, 0) ;
         System.out.println( Gx_msg );
         /* Execute user subroutine: 'PREFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PREFAS' Routine */
      returnInSub = false ;
      /* Using cursor P05VU3 */
      pr_default.execute(1, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P05VU3_A457FasCod[0] ;
         A460FasDsc = P05VU3_A460FasDsc[0] ;
         A396EmprCod = P05VU3_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPPREFAS

         */
         W396EmprCod = A396EmprCod ;
         W457FasCod = A457FasCod ;
         A396EmprCod = AV11EmprCod ;
         A252CliCod = AV12Clicod ;
         A467FasPreMtr = DecimalUtil.doubleToDec(0) ;
         n467FasPreMtr = false ;
         A466FasPreKgm = DecimalUtil.doubleToDec(0) ;
         n466FasPreKgm = false ;
         A470FasSumTin = httpContext.getMessage( "N", "") ;
         n470FasSumTin = false ;
         A3615FasFacCod = " " ;
         n3615FasFacCod = false ;
         A4385FasPreFAc = GXutil.nullDate() ;
         n4385FasPreFAc = false ;
         A4386FasPreKAn = DecimalUtil.ZERO ;
         n4386FasPreKAn = false ;
         A4387FasPreMAn = DecimalUtil.doubleToDec(0) ;
         n4387FasPreMAn = false ;
         A5518ClifsdUl = (short)(0) ;
         n5518ClifsdUl = false ;
         A5514ClifsiUl = (short)(0) ;
         n5514ClifsiUl = false ;
         A10882FasPreU = (byte)(0) ;
         n10882FasPreU = false ;
         A12576FasPreMt2 = DecimalUtil.doubleToDec(0) ;
         n12576FasPreMt2 = false ;
         A12577FasPreKgF = httpContext.getMessage( "N", "") ;
         n12577FasPreKgF = false ;
         A12704FasKgsMn = DecimalUtil.doubleToDec(0) ;
         n12704FasKgsMn = false ;
         /* Using cursor P05VU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod, Boolean.valueOf(n467FasPreMtr), A467FasPreMtr, Boolean.valueOf(n466FasPreKgm), A466FasPreKgm, Boolean.valueOf(n470FasSumTin), A470FasSumTin, Boolean.valueOf(n3615FasFacCod), A3615FasFacCod, Boolean.valueOf(n4385FasPreFAc), A4385FasPreFAc, Boolean.valueOf(n4386FasPreKAn), A4386FasPreKAn, Boolean.valueOf(n4387FasPreMAn), A4387FasPreMAn, Boolean.valueOf(n5518ClifsdUl), Short.valueOf(A5518ClifsdUl), Boolean.valueOf(n5514ClifsiUl), Short.valueOf(A5514ClifsiUl), Boolean.valueOf(n10882FasPreU), Byte.valueOf(A10882FasPreU), Boolean.valueOf(n12576FasPreMt2), A12576FasPreMt2, Boolean.valueOf(n12577FasPreKgF), A12577FasPreKgF, Boolean.valueOf(n12704FasKgsMn), A12704FasKgsMn});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
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
         A396EmprCod = W396EmprCod ;
         A457FasCod = W457FasCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc242.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprc242");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV11EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV10EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05VU2_A252CliCod = new int[1] ;
      P05VU2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      Gx_msg = "" ;
      P05VU3_A457FasCod = new String[] {""} ;
      P05VU3_A460FasDsc = new String[] {""} ;
      P05VU3_A396EmprCod = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      W396EmprCod = "" ;
      W457FasCod = "" ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A470FasSumTin = "" ;
      A3615FasFacCod = "" ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A4386FasPreKAn = DecimalUtil.ZERO ;
      A4387FasPreMAn = DecimalUtil.ZERO ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A12577FasPreKgF = "" ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc242__default(),
         new Object[] {
             new Object[] {
            P05VU2_A252CliCod, P05VU2_A396EmprCod
            }
            , new Object[] {
            P05VU3_A457FasCod, P05VU3_A460FasDsc, P05VU3_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10882FasPreU ;
   private short A5518ClifsdUl ;
   private short A5514ClifsiUl ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV12Clicod ;
   private int GX_INS85 ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A4386FasPreKAn ;
   private java.math.BigDecimal A4387FasPreMAn ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV11EmprCod ;
   private String GXv_char1[] ;
   private String AV10EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String W396EmprCod ;
   private String W457FasCod ;
   private String A470FasSumTin ;
   private String A3615FasFacCod ;
   private String A12577FasPreKgF ;
   private String Gx_emsg ;
   private java.util.Date A4385FasPreFAc ;
   private boolean returnInSub ;
   private boolean n467FasPreMtr ;
   private boolean n466FasPreKgm ;
   private boolean n470FasSumTin ;
   private boolean n3615FasFacCod ;
   private boolean n4385FasPreFAc ;
   private boolean n4386FasPreKAn ;
   private boolean n4387FasPreMAn ;
   private boolean n5518ClifsdUl ;
   private boolean n5514ClifsiUl ;
   private boolean n10882FasPreU ;
   private boolean n12576FasPreMt2 ;
   private boolean n12577FasPreKgF ;
   private boolean n12704FasKgsMn ;
   private IDataStoreProvider pr_default ;
   private int[] P05VU2_A252CliCod ;
   private String[] P05VU2_A396EmprCod ;
   private String[] P05VU3_A457FasCod ;
   private String[] P05VU3_A460FasDsc ;
   private String[] P05VU3_A396EmprCod ;
}

final  class apprc242__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05VU2", "SELECT CliCod, EmprCod FROM TXPCLIENT WHERE EmprCod = ? and CliCod > 0 ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05VU3", "SELECT FasCod, FasDsc, EmprCod FROM TXPFASPRO WHERE (EmprCod = ?) AND (SUBSTR(FasDsc, 1, 1) = '#') ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05VU4", "INSERT INTO TXPPREFAS(EmprCod, CliCod, FasCod, FasPreMtr, FasPreKgm, FasSumTin, FasFacCod, FasPreFAc, FasPreKAn, FasPreMAn, ClifsdUl, ClifsiUl, FasPreU, FasPreMt2, FasPreKgF, FasKgsMn, FasPreFAn, FasKgsEnt, FasFactura) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[28], 2);
               }
               return;
      }
   }

}

