package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class run_altafactura extends GXProcedure
{
   public run_altafactura( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( run_altafactura.class ), "" );
   }

   public run_altafactura( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      run_altafactura.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      run_altafactura.this.AV10pfxPath = aP0;
      run_altafactura.this.AV11pfxPassword = aP1;
      run_altafactura.this.AV12xmlContent = aP2;
      run_altafactura.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( AV9Response );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = run_altafactura.this.AV9Response;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Response = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV9Response ;
   private String AV10pfxPath ;
   private String AV11pfxPassword ;
   private String AV12xmlContent ;
   private String[] aP3 ;
}

