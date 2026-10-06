package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptermin extends GXProcedure
{
   public ptermin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptermin.class ), "" );
   }

   public ptermin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      ptermin.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      ptermin.this.AV15Station = aP0[0];
      this.aP0 = aP0;
      ptermin.this.AV16Station2 = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Station2 = AV15Station ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptermin.this.AV15Station;
      this.aP1[0] = ptermin.this.AV16Station2;
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
   private String AV15Station ;
   private String AV16Station2 ;
   private String[] aP1 ;
   private String[] aP0 ;
}

