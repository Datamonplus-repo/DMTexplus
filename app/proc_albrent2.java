package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class proc_albrent2 extends GXProcedure
{
   public proc_albrent2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( proc_albrent2.class ), "" );
   }

   public proc_albrent2( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      proc_albrent2.this.aP2 = new String[] {""};
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
      proc_albrent2.this.AV10AlbREnt = aP0[0];
      this.aP0 = aP0;
      proc_albrent2.this.AV8AlbREnt2 = aP1[0];
      this.aP1 = aP1;
      proc_albrent2.this.AV9AlbEntrada = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9AlbEntrada = ((GXutil.strcmp("", AV8AlbREnt2)==0) ? AV10AlbREnt : AV8AlbREnt2) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = proc_albrent2.this.AV10AlbREnt;
      this.aP1[0] = proc_albrent2.this.AV8AlbREnt2;
      this.aP2[0] = proc_albrent2.this.AV9AlbEntrada;
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
   private String AV10AlbREnt ;
   private String AV8AlbREnt2 ;
   private String AV9AlbEntrada ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
}

