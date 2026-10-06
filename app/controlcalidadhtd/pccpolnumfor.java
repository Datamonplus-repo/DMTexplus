package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccpolnumfor extends GXProcedure
{
   public pccpolnumfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccpolnumfor.class ), "" );
   }

   public pccpolnumfor( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( long aP0 ,
                             long aP1 ,
                             long aP2 ,
                             byte aP3 )
   {
      pccpolnumfor.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( long aP0 ,
                        long aP1 ,
                        long aP2 ,
                        byte aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             long aP1 ,
                             long aP2 ,
                             byte aP3 ,
                             String[] aP4 )
   {
      pccpolnumfor.this.AV8Num = aP0;
      pccpolnumfor.this.AV12Lgo = aP1;
      pccpolnumfor.this.AV13Dec = aP2;
      pccpolnumfor.this.AV9Formato = aP3;
      pccpolnumfor.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV9Formato == 1 )
      {
         AV11Ini = (long)(GXutil.len( GXutil.trim( GXutil.str( java.lang.Math.pow(AV8Num*10,AV13Dec), 10, 0)))-AV13Dec) ;
         AV10Str = GXutil.padl( GXutil.trim( GXutil.str( GXutil.Int( AV8Num), 10, 0)), (short)(AV12Lgo-AV13Dec), "0") ;
         if ( ! ( AV13Dec == 0 ) )
         {
            AV10Str += "." ;
            AV10Str += GXutil.substring( GXutil.trim( GXutil.str( java.lang.Math.pow(AV8Num*10,AV13Dec), 10, 0)), (int)(AV11Ini), (int)(AV13Dec)) ;
         }
      }
      else if ( AV9Formato == 2 )
      {
         AV11Ini = (long)(GXutil.len( GXutil.trim( GXutil.str( java.lang.Math.pow(AV8Num*10,AV13Dec), 10, 0)))-AV13Dec) ;
         AV10Str = GXutil.trim( GXutil.str( GXutil.Int( AV8Num), 10, 0)) ;
         if ( ! ( AV13Dec == 0 ) )
         {
            AV10Str += "." ;
            AV10Str += GXutil.trim( GXutil.str( CommonUtil.decimalVal( GXutil.substring( GXutil.trim( GXutil.str( java.lang.Math.pow(AV8Num*10,AV13Dec), 10, 0)), (int)(AV11Ini), (int)(AV13Dec)), "."), 10, 0)) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pccpolnumfor.this.AV10Str;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Str = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Formato ;
   private short Gx_err ;
   private long AV8Num ;
   private long AV12Lgo ;
   private long AV13Dec ;
   private long AV11Ini ;
   private String AV10Str ;
   private String[] aP4 ;
}

