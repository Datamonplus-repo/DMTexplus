package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlcd extends GXProcedure
{
   public pctrlcd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlcd.class ), "" );
   }

   public pctrlcd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pctrlcd.this.aP2 = new String[] {""};
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
      pctrlcd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlcd.this.AV8Emp_cub = aP1[0];
      this.aP1 = aP1;
      pctrlcd.this.Gx_msg = aP2[0];
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
      this.aP0[0] = pctrlcd.this.A396EmprCod;
      this.aP1[0] = pctrlcd.this.AV8Emp_cub;
      this.aP2[0] = pctrlcd.this.Gx_msg;
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
   private String AV8Emp_cub ;
   private String Gx_msg ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

