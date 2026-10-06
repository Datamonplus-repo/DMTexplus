package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phisprofd extends GXProcedure
{
   public phisprofd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phisprofd.class ), "" );
   }

   public phisprofd( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     java.util.Date[] aP1 ,
                                     java.util.Date[] aP2 )
   {
      phisprofd.this.aP3 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 )
   {
      phisprofd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phisprofd.this.AV47Hisprodti = aP1[0];
      this.aP1 = aP1;
      phisprofd.this.AV33HisProFec = aP2[0];
      this.aP2 = aP2;
      phisprofd.this.AV48HisProFd = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV46Var3 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HHMMSS", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      phisprofd.this.A396EmprCod = GXv_char2[0] ;
      phisprofd.this.GXt_char1 = GXv_char4[0] ;
      AV46Var3 = GXt_char1 ;
      if ( GXutil.strcmp(AV46Var3, " ") == 0 )
      {
         AV46Var3 = "01/01/01 05:59:59" ;
      }
      AV38Time1 = AV47Hisprodti ;
      AV39Var2 = localUtil.ttoc( AV38Time1, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV40Min1 = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 4, 2), "."))))) ;
      AV41Timei = localUtil.ctot( "01/01/01 23:59:59", localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV39Var2 = localUtil.ttoc( AV41Timei, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV45Mini = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 4, 2), "."))))) ;
      AV42Timef = localUtil.ctot( AV46Var3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV39Var2 = localUtil.ttoc( AV42Timef, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV43MinF = (int)(DecimalUtil.decToDouble((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 1, 2), ".").multiply(DecimalUtil.doubleToDec(60))).add((CommonUtil.decimalVal( GXutil.substring( AV39Var2, 4, 2), "."))))) ;
      AV44Resto = httpContext.getMessage( "N", "") ;
      if ( AV40Min1 < AV43MinF )
      {
         AV44Resto = httpContext.getMessage( "S", "") ;
      }
      if ( GXutil.strcmp(AV44Resto, httpContext.getMessage( "S", "")) == 0 )
      {
         AV48HisProFd = (GXutil.dadd(AV33HisProFec,-(1))) ;
      }
      else
      {
         AV48HisProFd = AV33HisProFec ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phisprofd.this.A396EmprCod;
      this.aP1[0] = phisprofd.this.AV47Hisprodti;
      this.aP2[0] = phisprofd.this.AV33HisProFec;
      this.aP3[0] = phisprofd.this.AV48HisProFd;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV46Var3 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV38Time1 = GXutil.resetTime( GXutil.nullDate() );
      AV39Var2 = "" ;
      AV41Timei = GXutil.resetTime( GXutil.nullDate() );
      AV42Timef = GXutil.resetTime( GXutil.nullDate() );
      AV44Resto = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV40Min1 ;
   private int AV45Mini ;
   private int AV43MinF ;
   private String A396EmprCod ;
   private String AV46Var3 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV39Var2 ;
   private String AV44Resto ;
   private java.util.Date AV47Hisprodti ;
   private java.util.Date AV38Time1 ;
   private java.util.Date AV41Timei ;
   private java.util.Date AV42Timef ;
   private java.util.Date AV33HisProFec ;
   private java.util.Date AV48HisProFd ;
   private java.util.Date[] aP3 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
}

