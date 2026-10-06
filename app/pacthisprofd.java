package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacthisprofd extends GXProcedure
{
   public pacthisprofd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacthisprofd.class ), "" );
   }

   public pacthisprofd( int remoteHandle ,
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
      AV51Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV25EmprCod ;
      GXv_char2[0] = AV49EmprNom ;
      GXv_char3[0] = AV50UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV51Station, GXv_char1, GXv_char2, GXv_char3) ;
      pacthisprofd.this.AV25EmprCod = GXv_char1[0] ;
      pacthisprofd.this.AV49EmprNom = GXv_char2[0] ;
      pacthisprofd.this.AV50UsurCod = GXv_char3[0] ;
      GXt_char4 = AV61ddmmaaaa ;
      GXv_char3[0] = AV25EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEINI", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      pacthisprofd.this.AV25EmprCod = GXv_char3[0] ;
      pacthisprofd.this.GXt_char4 = GXv_char1[0] ;
      AV61ddmmaaaa = GXt_char4 ;
      AV35Fec1 = ((GXutil.strcmp("", AV61ddmmaaaa)==0) ? localUtil.ctod( "01/01/01", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) : localUtil.ctod( AV61ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      GXt_char4 = AV61ddmmaaaa ;
      GXv_char3[0] = AV25EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "EGEFIN", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      pacthisprofd.this.AV25EmprCod = GXv_char3[0] ;
      pacthisprofd.this.GXt_char4 = GXv_char1[0] ;
      AV61ddmmaaaa = GXt_char4 ;
      AV36Fec2 = ((GXutil.strcmp("", AV61ddmmaaaa)==0) ? GXutil.today( ) : localUtil.ctod( AV61ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV48MaqCod2 = ((GXutil.strcmp("", AV48MaqCod2)==0) ? httpContext.getMessage( "ZZZZZZ", "") : AV48MaqCod2) ;
      GXt_char4 = AV46Var3 ;
      GXv_char3[0] = AV25EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "HHMMSS", "") ;
      GXv_char1[0] = GXt_char4 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1) ;
      pacthisprofd.this.AV25EmprCod = GXv_char3[0] ;
      pacthisprofd.this.GXt_char4 = GXv_char1[0] ;
      AV46Var3 = GXt_char4 ;
      AV46Var3 = ((GXutil.strcmp("", AV46Var3)==0) ? "01/01/01 05:59:59" : AV46Var3) ;
      AV57Maqcod = " " ;
      AV42Timef = localUtil.ctot( AV46Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV62fEC = GXutil.resetTime(localUtil.ctot( "01/01/01", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      /* Using cursor P05DQ2 */
      pr_default.execute(0, new Object[] {AV25EmprCod, AV47Maqcod1, AV35Fec1, AV36Fec2, AV48MaqCod2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10360HisProFd = P05DQ2_A10360HisProFd[0] ;
         A4441HisProDTF = P05DQ2_A4441HisProDTF[0] ;
         n4441HisProDTF = P05DQ2_n4441HisProDTF[0] ;
         A602MaqCod = P05DQ2_A602MaqCod[0] ;
         A558HisProFec = P05DQ2_A558HisProFec[0] ;
         A396EmprCod = P05DQ2_A396EmprCod[0] ;
         A561HisProLin = P05DQ2_A561HisProLin[0] ;
         if ( GXutil.resetTime(A10360HisProFd).before( GXutil.resetTime( AV62fEC )) || GXutil.resetTime(A10360HisProFd).after( GXutil.resetTime( GXutil.today( ) )) )
         {
            if ( GXutil.strcmp(AV57Maqcod, A602MaqCod) != 0 )
            {
               AV58Inicio = (byte)(0) ;
            }
            if ( AV58Inicio == 0 )
            {
               AV58Inicio = (byte)(1) ;
               AV55Var = localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( AV42Timef, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV53Dia1 = localUtil.ctot( AV55Var, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV59Diamas = localUtil.ctod( localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV55Var = localUtil.dtoc( GXutil.dadd(AV59Diamas,+(1)), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV42Timef, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV54Dia2 = localUtil.ctot( AV55Var, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV56Diac = localUtil.ctod( localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            }
            if ( (( A4441HisProDTF.after( AV53Dia1 ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV53Dia1) )) && (( A4441HisProDTF.before( AV54Dia2 ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV54Dia2) )) )
            {
            }
            else
            {
               AV55Var = localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " " + localUtil.ttoc( AV42Timef, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV53Dia1 = localUtil.ctot( AV55Var, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV59Diamas = localUtil.ctod( localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV55Var = localUtil.dtoc( GXutil.dadd(AV59Diamas,+(1)), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV42Timef, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               AV54Dia2 = localUtil.ctot( AV55Var, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV56Diac = localUtil.ctod( localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            }
            AV57Maqcod = A602MaqCod ;
            AV60Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Dia Completo ", "") + localUtil.dtoc( AV56Diac, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + GXutil.trim( A602MaqCod) + " " + localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + GXutil.str( A561HisProLin, 8, 0) ;
            System.out.println( AV60Control );
            if ( GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) )
            {
               A10360HisProFd = GXutil.nullDate() ;
            }
            else
            {
               A10360HisProFd = AV56Diac ;
            }
            /* Using cursor P05DQ3 */
            pr_default.execute(1, new Object[] {A10360HisProFd, A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pacthisprofd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51Station = "" ;
      AV25EmprCod = "" ;
      AV49EmprNom = "" ;
      AV50UsurCod = "" ;
      AV61ddmmaaaa = "" ;
      AV35Fec1 = GXutil.nullDate() ;
      AV36Fec2 = GXutil.nullDate() ;
      AV48MaqCod2 = "" ;
      AV46Var3 = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      AV57Maqcod = "" ;
      AV42Timef = GXutil.resetTime( GXutil.nullDate() );
      AV62fEC = GXutil.nullDate() ;
      scmdbuf = "" ;
      AV47Maqcod1 = "" ;
      P05DQ2_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      P05DQ2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P05DQ2_n4441HisProDTF = new boolean[] {false} ;
      P05DQ2_A602MaqCod = new String[] {""} ;
      P05DQ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05DQ2_A396EmprCod = new String[] {""} ;
      P05DQ2_A561HisProLin = new int[1] ;
      A10360HisProFd = GXutil.nullDate() ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV55Var = "" ;
      AV53Dia1 = GXutil.resetTime( GXutil.nullDate() );
      AV59Diamas = GXutil.nullDate() ;
      AV54Dia2 = GXutil.resetTime( GXutil.nullDate() );
      AV56Diac = GXutil.nullDate() ;
      AV60Control = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacthisprofd__default(),
         new Object[] {
             new Object[] {
            P05DQ2_A10360HisProFd, P05DQ2_A4441HisProDTF, P05DQ2_n4441HisProDTF, P05DQ2_A602MaqCod, P05DQ2_A558HisProFec, P05DQ2_A396EmprCod, P05DQ2_A561HisProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV58Inicio ;
   private short Gx_err ;
   private int A561HisProLin ;
   private String AV51Station ;
   private String AV25EmprCod ;
   private String AV49EmprNom ;
   private String AV50UsurCod ;
   private String AV61ddmmaaaa ;
   private String AV48MaqCod2 ;
   private String AV46Var3 ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV57Maqcod ;
   private String scmdbuf ;
   private String AV47Maqcod1 ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String AV55Var ;
   private java.util.Date AV42Timef ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV53Dia1 ;
   private java.util.Date AV54Dia2 ;
   private java.util.Date AV35Fec1 ;
   private java.util.Date AV36Fec2 ;
   private java.util.Date AV62fEC ;
   private java.util.Date A10360HisProFd ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV59Diamas ;
   private java.util.Date AV56Diac ;
   private boolean n4441HisProDTF ;
   private String AV60Control ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P05DQ2_A10360HisProFd ;
   private java.util.Date[] P05DQ2_A4441HisProDTF ;
   private boolean[] P05DQ2_n4441HisProDTF ;
   private String[] P05DQ2_A602MaqCod ;
   private java.util.Date[] P05DQ2_A558HisProFec ;
   private String[] P05DQ2_A396EmprCod ;
   private int[] P05DQ2_A561HisProLin ;
}

final  class pacthisprofd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05DQ2", "SELECT HisProFd, HisProDTF, MaqCod, HisProFec, EmprCod, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod >= ? and HisProFec >= ?) AND (HisProFec <= ?) AND (Not (HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) AND (MaqCod <= ?) ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05DQ3", "UPDATE TXPLHIPRO SET HisProFd=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 1 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

