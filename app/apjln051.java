package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln051 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln051 pgm = new apjln051 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln051( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln051.class ), "" );
   }

   public apjln051( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Proceso de carga Calendario en fucnion de AC", "") );
      /* Using cursor P01N92 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P01N92_A602MaqCod[0] ;
         A396EmprCod = P01N92_A396EmprCod[0] ;
         AV9EmprCod = A396EmprCod ;
         AV8MaqCod = A602MaqCod ;
         /* Execute user subroutine: 'CALENDARIO' */
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Act Calendario", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'CALENDARIO' Routine */
      returnInSub = false ;
      /* Using cursor P01N93 */
      pr_default.execute(1, new Object[] {AV9EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A610MaqHNPMes = P01N93_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P01N93_n610MaqHNPMes[0] ;
         A602MaqCod = P01N93_A602MaqCod[0] ;
         A396EmprCod = P01N93_A396EmprCod[0] ;
         A614MaqMes = P01N93_A614MaqMes[0] ;
         A599MaqAny = P01N93_A599MaqAny[0] ;
         if ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "AC", "")) == 0 )
         {
            W396EmprCod = A396EmprCod ;
            AV10Maqhnpmes = A610MaqHNPMes ;
            /*
               INSERT RECORD ON TABLE TXPMAQHNP

            */
            W396EmprCod = A396EmprCod ;
            W602MaqCod = A602MaqCod ;
            W610MaqHNPMes = A610MaqHNPMes ;
            n610MaqHNPMes = false ;
            A396EmprCod = AV9EmprCod ;
            A602MaqCod = AV8MaqCod ;
            A610MaqHNPMes = AV10Maqhnpmes ;
            n610MaqHNPMes = false ;
            /* Using cursor P01N94 */
            pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Boolean.valueOf(n610MaqHNPMes), A610MaqHNPMes});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQHNP");
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
            A602MaqCod = W602MaqCod ;
            A610MaqHNPMes = W610MaqHNPMes ;
            n610MaqHNPMes = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P01N95 */
      pr_default.execute(3, new Object[] {AV9EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A5124MaqHnpI1i = P01N95_A5124MaqHnpI1i[0] ;
         n5124MaqHnpI1i = P01N95_n5124MaqHnpI1i[0] ;
         A602MaqCod = P01N95_A602MaqCod[0] ;
         A396EmprCod = P01N95_A396EmprCod[0] ;
         A5129MaqHnpI3f = P01N95_A5129MaqHnpI3f[0] ;
         n5129MaqHnpI3f = P01N95_n5129MaqHnpI3f[0] ;
         A5128MaqHnpI3i = P01N95_A5128MaqHnpI3i[0] ;
         n5128MaqHnpI3i = P01N95_n5128MaqHnpI3i[0] ;
         A5127MaqHnpI2f = P01N95_A5127MaqHnpI2f[0] ;
         n5127MaqHnpI2f = P01N95_n5127MaqHnpI2f[0] ;
         A5126MaqHnpI2i = P01N95_A5126MaqHnpI2i[0] ;
         n5126MaqHnpI2i = P01N95_n5126MaqHnpI2i[0] ;
         A5125MaqHnpI1f = P01N95_A5125MaqHnpI1f[0] ;
         n5125MaqHnpI1f = P01N95_n5125MaqHnpI1f[0] ;
         A5123MaqHnpDia = P01N95_A5123MaqHnpDia[0] ;
         A614MaqMes = P01N95_A614MaqMes[0] ;
         A599MaqAny = P01N95_A599MaqAny[0] ;
         if ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "AC", "")) == 0 )
         {
            W396EmprCod = A396EmprCod ;
            AV11MAQHNPI1I = A5124MaqHnpI1i ;
            /*
               INSERT RECORD ON TABLE TXPINTHNP

            */
            W396EmprCod = A396EmprCod ;
            W602MaqCod = A602MaqCod ;
            W5124MaqHnpI1i = A5124MaqHnpI1i ;
            n5124MaqHnpI1i = false ;
            A396EmprCod = AV9EmprCod ;
            A602MaqCod = AV8MaqCod ;
            A5124MaqHnpI1i = AV11MAQHNPI1I ;
            n5124MaqHnpI1i = false ;
            /* Using cursor P01N96 */
            pr_default.execute(4, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A599MaqAny), Byte.valueOf(A614MaqMes), Byte.valueOf(A5123MaqHnpDia), Boolean.valueOf(n5124MaqHnpI1i), A5124MaqHnpI1i, Boolean.valueOf(n5125MaqHnpI1f), A5125MaqHnpI1f, Boolean.valueOf(n5126MaqHnpI2i), A5126MaqHnpI2i, Boolean.valueOf(n5127MaqHnpI2f), A5127MaqHnpI2f, Boolean.valueOf(n5128MaqHnpI3i), A5128MaqHnpI3i, Boolean.valueOf(n5129MaqHnpI3f), A5129MaqHnpI3f});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINTHNP");
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
            A396EmprCod = W396EmprCod ;
            A602MaqCod = W602MaqCod ;
            A5124MaqHnpI1i = W5124MaqHnpI1i ;
            n5124MaqHnpI1i = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln051.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln051");
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
      P01N92_A602MaqCod = new String[] {""} ;
      P01N92_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      AV9EmprCod = "" ;
      AV8MaqCod = "" ;
      P01N93_A610MaqHNPMes = new String[] {""} ;
      P01N93_n610MaqHNPMes = new boolean[] {false} ;
      P01N93_A602MaqCod = new String[] {""} ;
      P01N93_A396EmprCod = new String[] {""} ;
      P01N93_A614MaqMes = new byte[1] ;
      P01N93_A599MaqAny = new short[1] ;
      A610MaqHNPMes = "" ;
      W396EmprCod = "" ;
      AV10Maqhnpmes = "" ;
      W602MaqCod = "" ;
      W610MaqHNPMes = "" ;
      Gx_emsg = "" ;
      P01N95_A5124MaqHnpI1i = new java.util.Date[] {GXutil.nullDate()} ;
      P01N95_n5124MaqHnpI1i = new boolean[] {false} ;
      P01N95_A602MaqCod = new String[] {""} ;
      P01N95_A396EmprCod = new String[] {""} ;
      P01N95_A5129MaqHnpI3f = new java.util.Date[] {GXutil.nullDate()} ;
      P01N95_n5129MaqHnpI3f = new boolean[] {false} ;
      P01N95_A5128MaqHnpI3i = new java.util.Date[] {GXutil.nullDate()} ;
      P01N95_n5128MaqHnpI3i = new boolean[] {false} ;
      P01N95_A5127MaqHnpI2f = new java.util.Date[] {GXutil.nullDate()} ;
      P01N95_n5127MaqHnpI2f = new boolean[] {false} ;
      P01N95_A5126MaqHnpI2i = new java.util.Date[] {GXutil.nullDate()} ;
      P01N95_n5126MaqHnpI2i = new boolean[] {false} ;
      P01N95_A5125MaqHnpI1f = new java.util.Date[] {GXutil.nullDate()} ;
      P01N95_n5125MaqHnpI1f = new boolean[] {false} ;
      P01N95_A5123MaqHnpDia = new byte[1] ;
      P01N95_A614MaqMes = new byte[1] ;
      P01N95_A599MaqAny = new short[1] ;
      A5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      A5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      A5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      A5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      A5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      A5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      AV11MAQHNPI1I = GXutil.resetTime( GXutil.nullDate() );
      W5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln051__default(),
         new Object[] {
             new Object[] {
            P01N92_A602MaqCod, P01N92_A396EmprCod
            }
            , new Object[] {
            P01N93_A610MaqHNPMes, P01N93_n610MaqHNPMes, P01N93_A602MaqCod, P01N93_A396EmprCod, P01N93_A614MaqMes, P01N93_A599MaqAny
            }
            , new Object[] {
            }
            , new Object[] {
            P01N95_A5124MaqHnpI1i, P01N95_n5124MaqHnpI1i, P01N95_A602MaqCod, P01N95_A396EmprCod, P01N95_A5129MaqHnpI3f, P01N95_n5129MaqHnpI3f, P01N95_A5128MaqHnpI3i, P01N95_n5128MaqHnpI3i, P01N95_A5127MaqHnpI2f, P01N95_n5127MaqHnpI2f,
            P01N95_A5126MaqHnpI2i, P01N95_n5126MaqHnpI2i, P01N95_A5125MaqHnpI1f, P01N95_n5125MaqHnpI1f, P01N95_A5123MaqHnpDia, P01N95_A614MaqMes, P01N95_A599MaqAny
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A614MaqMes ;
   private byte A5123MaqHnpDia ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int GX_INS67 ;
   private int GX_INS748 ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String AV9EmprCod ;
   private String AV8MaqCod ;
   private String W396EmprCod ;
   private String W602MaqCod ;
   private String Gx_emsg ;
   private java.util.Date A5124MaqHnpI1i ;
   private java.util.Date A5129MaqHnpI3f ;
   private java.util.Date A5128MaqHnpI3i ;
   private java.util.Date A5127MaqHnpI2f ;
   private java.util.Date A5126MaqHnpI2i ;
   private java.util.Date A5125MaqHnpI1f ;
   private java.util.Date AV11MAQHNPI1I ;
   private java.util.Date W5124MaqHnpI1i ;
   private boolean returnInSub ;
   private boolean n610MaqHNPMes ;
   private boolean n5124MaqHnpI1i ;
   private boolean n5129MaqHnpI3f ;
   private boolean n5128MaqHnpI3i ;
   private boolean n5127MaqHnpI2f ;
   private boolean n5126MaqHnpI2i ;
   private boolean n5125MaqHnpI1f ;
   private String A610MaqHNPMes ;
   private String AV10Maqhnpmes ;
   private String W610MaqHNPMes ;
   private IDataStoreProvider pr_default ;
   private String[] P01N92_A602MaqCod ;
   private String[] P01N92_A396EmprCod ;
   private String[] P01N93_A610MaqHNPMes ;
   private boolean[] P01N93_n610MaqHNPMes ;
   private String[] P01N93_A602MaqCod ;
   private String[] P01N93_A396EmprCod ;
   private byte[] P01N93_A614MaqMes ;
   private short[] P01N93_A599MaqAny ;
   private java.util.Date[] P01N95_A5124MaqHnpI1i ;
   private boolean[] P01N95_n5124MaqHnpI1i ;
   private String[] P01N95_A602MaqCod ;
   private String[] P01N95_A396EmprCod ;
   private java.util.Date[] P01N95_A5129MaqHnpI3f ;
   private boolean[] P01N95_n5129MaqHnpI3f ;
   private java.util.Date[] P01N95_A5128MaqHnpI3i ;
   private boolean[] P01N95_n5128MaqHnpI3i ;
   private java.util.Date[] P01N95_A5127MaqHnpI2f ;
   private boolean[] P01N95_n5127MaqHnpI2f ;
   private java.util.Date[] P01N95_A5126MaqHnpI2i ;
   private boolean[] P01N95_n5126MaqHnpI2i ;
   private java.util.Date[] P01N95_A5125MaqHnpI1f ;
   private boolean[] P01N95_n5125MaqHnpI1f ;
   private byte[] P01N95_A5123MaqHnpDia ;
   private byte[] P01N95_A614MaqMes ;
   private short[] P01N95_A599MaqAny ;
}

final  class apjln051__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01N92", "SELECT MaqCod, EmprCod FROM TXPMAQUIN ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01N93", "SELECT MaqHNPMes, MaqCod, EmprCod, MaqMes, MaqAny FROM TXPMAQHNP WHERE EmprCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01N94", "INSERT INTO TXPMAQHNP(EmprCod, MaqCod, MaqAny, MaqMes, MaqHNPMes) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQHNP")
         ,new ForEachCursor("P01N95", "SELECT MaqHnpI1i, MaqCod, EmprCod, MaqHnpI3f, MaqHnpI3i, MaqHnpI2f, MaqHnpI2i, MaqHnpI1f, MaqHnpDia, MaqMes, MaqAny FROM TXPINTHNP WHERE EmprCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01N96", "INSERT INTO TXPINTHNP(EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia, MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINTHNP")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = GXutil.resetDate(rslt.getGXDateTime(1));
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((short[]) buf[16])[0] = rslt.getShort(11);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 63);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], true);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[8], true);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[10], true);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[12], true);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[14], true);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[16], true);
               }
               return;
      }
   }

}

