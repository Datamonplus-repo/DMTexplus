package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class barenccli extends GXProcedure
{
   public barenccli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( barenccli.class ), "" );
   }

   public barenccli( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      barenccli.this.aP2 = new String[] {""};
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
      barenccli.this.AV8Bardisnum = aP0[0];
      this.aP0 = aP0;
      barenccli.this.AV9BarEncli = aP1[0];
      this.aP1 = aP1;
      barenccli.this.AV10Enccli = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Enccli = (!(GXutil.strcmp("", AV9BarEncli)==0) ? AV9BarEncli : AV8Bardisnum) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = barenccli.this.AV8Bardisnum;
      this.aP1[0] = barenccli.this.AV9BarEncli;
      this.aP2[0] = barenccli.this.AV10Enccli;
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
   private String AV8Bardisnum ;
   private String AV9BarEncli ;
   private String AV10Enccli ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

