package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmullfas extends GXProcedure
{
   public pmullfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmullfas.class ), "" );
   }

   public pmullfas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pmullfas.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pmullfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmullfas.this.AV21Ordlin_m = aP1[0];
      this.aP1 = aP1;
      pmullfas.this.Gx_msg = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      if ( ( GXutil.Int( AV16BarOrdlin/ (double) (5)) == ( AV16BarOrdlin / (double) ( 5 ) ) ) )
      {
      }
      else
      {
         AV21Ordlin_m = (short)(5*GXutil.Int( AV16BarOrdlin/ (double) (5))+5) ;
         Gx_msg = httpContext.getMessage( "Atencion.El sistema detecto", "") + GXutil.newLine( ) + httpContext.getMessage( "que el numero introducido no es multiplo de 5.", "") + GXutil.newLine( ) + httpContext.getMessage( "Calculo el nuevo valor para ", "") + GXutil.str( AV21Ordlin_m, 4, 0) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmullfas.this.A396EmprCod;
      this.aP1[0] = pmullfas.this.AV21Ordlin_m;
      this.aP2[0] = pmullfas.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV21Ordlin_m ;
   private short AV16BarOrdlin ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
}

