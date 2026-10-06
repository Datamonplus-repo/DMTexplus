package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedadp extends GXProcedure
{
   public ppedadp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedadp.class ), "" );
   }

   public ppedadp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      ppedadp.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      ppedadp.this.A396EmprCod = aP0;
      ppedadp.this.A11604PArtId = aP1;
      ppedadp.this.AV26Usurcod = aP2;
      ppedadp.this.aP3 = aP3;
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
      this.aP3[0] = ppedadp.this.Gx_out;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_out = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11604PArtId ;
   private String A396EmprCod ;
   private String AV26Usurcod ;
   private String Gx_out ;
   private String[] aP3 ;
}

