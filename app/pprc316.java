package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc316 extends GXProcedure
{
   public pprc316( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc316.class ), "" );
   }

   public pprc316( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      pprc316.this.A396EmprCod = aP0;
      pprc316.this.AV27Hisprodtf = aP1;
      pprc316.this.AV28Hisprodtf_to = aP2;
      pprc316.this.AV21maqcod1 = aP3;
      pprc316.this.AV22maqcod2 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17Treal ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int2) ;
      pprc316.this.GXt_int1 = GXv_int2[0] ;
      AV17Treal = GXt_int1 ;
      GXt_int1 = AV19Lavan ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int2) ;
      pprc316.this.GXt_int1 = GXv_int2[0] ;
      AV19Lavan = GXt_int1 ;
      GXt_int1 = AV26Grulec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      pprc316.this.GXt_int1 = GXv_int2[0] ;
      AV26Grulec = GXt_int1 ;
      GXt_char3 = AV40Var3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "HHMMSS", "") ;
      GXv_char6[0] = GXt_char3 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_char6) ;
      pprc316.this.A396EmprCod = GXv_char4[0] ;
      pprc316.this.GXt_char3 = GXv_char6[0] ;
      AV40Var3 = GXt_char3 ;
      AV40Var3 = ((GXutil.strcmp("", AV40Var3)==0) ? "01/01/01 05:59:59" : AV40Var3) ;
      /* Using cursor P09QG2 */
      pr_default.execute(0, new Object[] {AV21maqcod1, AV27Hisprodtf, A396EmprCod, AV28Hisprodtf_to, AV22maqcod2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4441HisProDTF = P09QG2_A4441HisProDTF[0] ;
         n4441HisProDTF = P09QG2_n4441HisProDTF[0] ;
         A656ParCod = P09QG2_A656ParCod[0] ;
         n656ParCod = P09QG2_n656ParCod[0] ;
         A602MaqCod = P09QG2_A602MaqCod[0] ;
         A10360HisProFd = P09QG2_A10360HisProFd[0] ;
         A558HisProFec = P09QG2_A558HisProFec[0] ;
         A561HisProLin = P09QG2_A561HisProLin[0] ;
         AV33Diamas = localUtil.ctod( localUtil.ttoc( A4441HisProDTF, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV37Time1 = A4441HisProDTF ;
         AV39Var2 = localUtil.ttoc( AV37Time1, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV34Min1 = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 4, 2), "."))))) ;
         AV38Timef = localUtil.ctot( AV40Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV39Var2 = localUtil.ttoc( AV38Timef, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV35MinF = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 4, 2), "."))))) ;
         AV36Resto = httpContext.getMessage( "N", "") ;
         if ( AV34Min1 < AV35MinF )
         {
            AV36Resto = httpContext.getMessage( "S", "") ;
         }
         if ( GXutil.strcmp(AV36Resto, httpContext.getMessage( "S", "")) == 0 )
         {
            AV32DiaC = (GXutil.dadd(AV33Diamas,-(1))) ;
         }
         else
         {
            AV32DiaC = AV33Diamas ;
         }
         A10360HisProFd = AV32DiaC ;
         System.out.println( httpContext.getMessage( "control dia completo.....", "")+GXutil.trim( A602MaqCod)+" "+localUtil.dtoc( A10360HisProFd, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         /* Using cursor P09QG3 */
         pr_default.execute(1, new Object[] {A10360HisProFd, A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc316");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV40Var3 = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      scmdbuf = "" ;
      P09QG2_A396EmprCod = new String[] {""} ;
      P09QG2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09QG2_n4441HisProDTF = new boolean[] {false} ;
      P09QG2_A656ParCod = new short[1] ;
      P09QG2_n656ParCod = new boolean[] {false} ;
      P09QG2_A602MaqCod = new String[] {""} ;
      P09QG2_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      P09QG2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09QG2_A561HisProLin = new int[1] ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A10360HisProFd = GXutil.nullDate() ;
      A558HisProFec = GXutil.nullDate() ;
      AV33Diamas = GXutil.nullDate() ;
      AV37Time1 = GXutil.resetTime( GXutil.nullDate() );
      AV39Var2 = "" ;
      AV38Timef = GXutil.resetTime( GXutil.nullDate() );
      AV36Resto = "" ;
      AV32DiaC = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc316__default(),
         new Object[] {
             new Object[] {
            P09QG2_A396EmprCod, P09QG2_A4441HisProDTF, P09QG2_n4441HisProDTF, P09QG2_A656ParCod, P09QG2_n656ParCod, P09QG2_A602MaqCod, P09QG2_A10360HisProFd, P09QG2_A558HisProFec, P09QG2_A561HisProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Treal ;
   private byte AV19Lavan ;
   private byte AV26Grulec ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A561HisProLin ;
   private int AV34Min1 ;
   private int AV35MinF ;
   private String A396EmprCod ;
   private String AV21maqcod1 ;
   private String AV22maqcod2 ;
   private String AV40Var3 ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String AV39Var2 ;
   private String AV36Resto ;
   private java.util.Date AV27Hisprodtf ;
   private java.util.Date AV28Hisprodtf_to ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV37Time1 ;
   private java.util.Date AV38Timef ;
   private java.util.Date A10360HisProFd ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV33Diamas ;
   private java.util.Date AV32DiaC ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
   private IDataStoreProvider pr_default ;
   private String[] P09QG2_A396EmprCod ;
   private java.util.Date[] P09QG2_A4441HisProDTF ;
   private boolean[] P09QG2_n4441HisProDTF ;
   private short[] P09QG2_A656ParCod ;
   private boolean[] P09QG2_n656ParCod ;
   private String[] P09QG2_A602MaqCod ;
   private java.util.Date[] P09QG2_A10360HisProFd ;
   private java.util.Date[] P09QG2_A558HisProFec ;
   private int[] P09QG2_A561HisProLin ;
}

final  class pprc316__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QG2", "SELECT EmprCod, HisProDTF, ParCod, MaqCod, HisProFd, HisProFec, HisProLin FROM TXPLHIPRO WHERE (MaqCod >= ? and HisProDTF >= ?) AND (EmprCod = ?) AND ((ParCod = 0)) AND (HisProDTF <= ?) AND (MaqCod <= ?) ORDER BY MaqCod, HisProDTF ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09QG3", "UPDATE TXPLHIPRO SET HisProFd=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
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

