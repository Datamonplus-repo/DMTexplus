package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rcentcox extends GXProcedure
{
   public rcentcox( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcentcox.class ), "" );
   }

   public rcentcox( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 )
   {
      rcentcox.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        short[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             short[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 )
   {
      rcentcox.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rcentcox.this.AV8PCcoco = aP1[0];
      this.aP1 = aP1;
      rcentcox.this.AV9UCcoco = aP2[0];
      this.aP2 = aP2;
      rcentcox.this.AV10PFecha = aP3[0];
      this.aP3 = aP3;
      rcentcox.this.AV11UFecha = aP4[0];
      this.aP4 = aP4;
      rcentcox.this.AV32Archivo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rcentcox.this.A396EmprCod;
      this.aP1[0] = rcentcox.this.AV8PCcoco;
      this.aP2[0] = rcentcox.this.AV9UCcoco;
      this.aP3[0] = rcentcox.this.AV10PFecha;
      this.aP4[0] = rcentcox.this.AV11UFecha;
      this.aP5[0] = rcentcox.this.AV32Archivo;
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

   private short AV8PCcoco ;
   private short AV9UCcoco ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV32Archivo ;
   private java.util.Date AV10PFecha ;
   private java.util.Date AV11UFecha ;
   private String[] aP5 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private short[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
}

