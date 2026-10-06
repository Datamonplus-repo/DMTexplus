package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plicdcrp extends GXProcedure
{
   public plicdcrp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plicdcrp.class ), "" );
   }

   public plicdcrp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      plicdcrp.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      plicdcrp.this.AV9txtcryp = aP0[0];
      this.aP0 = aP0;
      plicdcrp.this.AV14txtclave = aP1[0];
      this.aP1 = aP1;
      plicdcrp.this.AV8txtdcryp = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14txtclave = GXutil.trim( AV14txtclave) ;
      AV14txtclave = GXutil.upper( AV14txtclave) ;
      AV15cntclave = 1 ;
      AV10cnt = 1 ;
      GXt_int1 = AV13asc0 ;
      GXv_char2[0] = "#" ;
      GXv_int3[0] = GXt_int1 ;
      new app.plicasc(remoteHandle, context).execute( GXv_char2, GXv_int3) ;
      plicdcrp.this.GXt_int1 = GXv_int3[0] ;
      AV13asc0 = GXt_int1 ;
      AV17asctbllen = 67 ;
      AV8txtdcryp = "" ;
      while ( AV10cnt <= GXutil.len( AV9txtcryp) )
      {
         AV16letraclave = GXutil.substring( AV14txtclave, (int)(AV15cntclave), 1) ;
         AV15cntclave = (long)(AV15cntclave+1) ;
         if ( AV15cntclave > GXutil.len( AV14txtclave) )
         {
            AV15cntclave = 1 ;
         }
         AV12letra = GXutil.substring( AV9txtcryp, (int)(AV10cnt), 1) ;
         GXt_int1 = AV18ascletra ;
         GXv_char2[0] = AV12letra ;
         GXv_int3[0] = GXt_int1 ;
         new app.plicasc(remoteHandle, context).execute( GXv_char2, GXv_int3) ;
         plicdcrp.this.AV12letra = GXv_char2[0] ;
         plicdcrp.this.GXt_int1 = GXv_int3[0] ;
         AV18ascletra = GXt_int1 ;
         GXt_int1 = AV19ascletracl ;
         GXv_char2[0] = AV16letraclave ;
         GXv_int3[0] = GXt_int1 ;
         new app.plicasc(remoteHandle, context).execute( GXv_char2, GXv_int3) ;
         plicdcrp.this.AV16letraclave = GXv_char2[0] ;
         plicdcrp.this.GXt_int1 = GXv_int3[0] ;
         AV19ascletracl = GXt_int1 ;
         AV11num1 = (short)((AV18ascletra-AV13asc0)-(AV19ascletracl-AV13asc0)+AV17asctbllen) ;
         GXt_int4 = AV11num1 ;
         GXv_int5[0] = AV11num1 ;
         GXv_int6[0] = AV17asctbllen ;
         GXv_int7[0] = GXt_int4 ;
         new app.plicmod(remoteHandle, context).execute( GXv_int5, GXv_int6, GXv_int7) ;
         plicdcrp.this.AV11num1 = (short)((short)(GXv_int5[0])) ;
         plicdcrp.this.AV17asctbllen = GXv_int6[0] ;
         plicdcrp.this.GXt_int4 = GXv_int7[0] ;
         AV11num1 = (short)(GXt_int4) ;
         AV11num1 = (short)(AV11num1+AV13asc0) ;
         GXt_char8 = AV8txtdcryp ;
         GXv_int3[0] = AV11num1 ;
         GXv_char2[0] = GXt_char8 ;
         new app.plicchr(remoteHandle, context).execute( GXv_int3, GXv_char2) ;
         plicdcrp.this.AV11num1 = GXv_int3[0] ;
         plicdcrp.this.GXt_char8 = GXv_char2[0] ;
         AV8txtdcryp += GXt_char8 ;
         AV10cnt = (long)(AV10cnt+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plicdcrp.this.AV9txtcryp;
      this.aP1[0] = plicdcrp.this.AV14txtclave;
      this.aP2[0] = plicdcrp.this.AV8txtdcryp;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16letraclave = "" ;
      AV12letra = "" ;
      GXv_int5 = new long[1] ;
      GXv_int6 = new long[1] ;
      GXv_int7 = new long[1] ;
      GXt_char8 = "" ;
      GXv_int3 = new short[1] ;
      GXv_char2 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13asc0 ;
   private short AV18ascletra ;
   private short AV19ascletracl ;
   private short GXt_int1 ;
   private short AV11num1 ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private long AV15cntclave ;
   private long AV10cnt ;
   private long AV17asctbllen ;
   private long GXt_int4 ;
   private long GXv_int5[] ;
   private long GXv_int6[] ;
   private long GXv_int7[] ;
   private String AV16letraclave ;
   private String AV12letra ;
   private String GXt_char8 ;
   private String GXv_char2[] ;
   private String AV9txtcryp ;
   private String AV14txtclave ;
   private String AV8txtdcryp ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

