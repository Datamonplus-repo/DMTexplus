package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class sask extends GXProcedure
{
   public sask( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sask.class ), "" );
   }

   public sask( int remoteHandle ,
                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      sask.this.aP3 = new String[] {""};
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
      sask.this.AV8parm1_CHARACTER = aP0;
      sask.this.AV9parm2_CHARACTER = aP1;
      sask.this.AV10parm3_CHARACTER = aP2;
      sask.this.aP3 = aP3;
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
      this.aP3[0] = sask.this.AV11Aux;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Aux = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8parm1_CHARACTER ;
   private String AV9parm2_CHARACTER ;
   private String AV10parm3_CHARACTER ;
   private String AV11Aux ;
   private String[] aP3 ;
}

