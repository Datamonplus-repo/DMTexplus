package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfirmactrl extends GXProcedure
{
   public pfirmactrl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfirmactrl.class ), "" );
   }

   public pfirmactrl( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pfirmactrl.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pfirmactrl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfirmactrl.this.AV26FacCod = aP1[0];
      this.aP1 = aP1;
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
      this.aP0[0] = pfirmactrl.this.A396EmprCod;
      this.aP1[0] = pfirmactrl.this.AV26FacCod;
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
   private int AV26FacCod ;
   private String A396EmprCod ;
   private int[] aP1 ;
   private String[] aP0 ;
}

