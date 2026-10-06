package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rhispro extends GXProcedure
{
   public rhispro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rhispro.class ), "" );
   }

   public rhispro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     String[] aP1 )
   {
      rhispro.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 )
   {
      rhispro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rhispro.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      rhispro.this.A558HisProFec = aP2[0];
      this.aP2 = aP2;
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
      this.aP0[0] = rhispro.this.A396EmprCod;
      this.aP1[0] = rhispro.this.A602MaqCod;
      this.aP2[0] = rhispro.this.A558HisProFec;
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

   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private java.util.Date A558HisProFec ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

