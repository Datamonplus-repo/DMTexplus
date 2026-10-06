package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisquip extends GXProcedure
{
   public pdisquip( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisquip.class ), "" );
   }

   public pdisquip( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pdisquip.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pdisquip.this.AV24EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisquip.this.AV22DisCod = aP1[0];
      this.aP1 = aP1;
      pdisquip.this.AV23ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV24EmprCod ;
      GXv_int2[0] = AV22DisCod ;
      GXv_char3[0] = AV23ProCod ;
      new app.pdisquitrn(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
      pdisquip.this.AV24EmprCod = GXv_char1[0] ;
      pdisquip.this.AV22DisCod = GXv_int2[0] ;
      pdisquip.this.AV23ProCod = GXv_char3[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisquip.this.AV24EmprCod;
      this.aP1[0] = pdisquip.this.AV22DisCod;
      this.aP2[0] = pdisquip.this.AV23ProCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV22DisCod ;
   private int GXv_int2[] ;
   private String AV24EmprCod ;
   private String AV23ProCod ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
}

