package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedidocliente_formula extends GXProcedure
{
   public ppedidocliente_formula( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedidocliente_formula.class ), "" );
   }

   public ppedidocliente_formula( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      ppedidocliente_formula.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ppedidocliente_formula.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedidocliente_formula.this.AV8BarEnccli = aP1[0];
      this.aP1 = aP1;
      ppedidocliente_formula.this.AV9BarDisnum = aP2[0];
      this.aP2 = aP2;
      ppedidocliente_formula.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV11Enc20c) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int2) ;
      ppedidocliente_formula.this.GXt_int1 = GXv_int2[0] ;
      AV11Enc20c = GXt_int1 ;
      AV10PedidoCliente = ((AV11Enc20c==1) ? AV8BarEnccli : AV9BarDisnum) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedidocliente_formula.this.A396EmprCod;
      this.aP1[0] = ppedidocliente_formula.this.AV8BarEnccli;
      this.aP2[0] = ppedidocliente_formula.this.AV9BarDisnum;
      this.aP3[0] = ppedidocliente_formula.this.AV10PedidoCliente;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10PedidoCliente = "" ;
      GXv_int2 = new byte[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV11Enc20c ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8BarEnccli ;
   private String AV9BarDisnum ;
   private String AV10PedidoCliente ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
}

