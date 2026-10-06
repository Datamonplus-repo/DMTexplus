package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rdevgeh extends GXProcedure
{
   public rdevgeh( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdevgeh.class ), "" );
   }

   public rdevgeh( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      rdevgeh.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      rdevgeh.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rdevgeh.this.A1453DevGenHil = aP1[0];
      this.aP1 = aP1;
      rdevgeh.this.AV15ImpCod = aP2[0];
      this.aP2 = aP2;
      rdevgeh.this.AV38Puerto = aP3[0];
      this.aP3 = aP3;
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
      this.aP0[0] = rdevgeh.this.A396EmprCod;
      this.aP1[0] = rdevgeh.this.A1453DevGenHil;
      this.aP2[0] = rdevgeh.this.AV15ImpCod;
      this.aP3[0] = rdevgeh.this.AV38Puerto;
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
   private int A1453DevGenHil ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV38Puerto ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
}

