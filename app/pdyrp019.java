package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp019 extends GXProcedure
{
   public pdyrp019( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp019.class ), "" );
   }

   public pdyrp019( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( int[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      pdyrp019.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( int[] aP0 ,
                        byte[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( int[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pdyrp019.this.AV15BarCodI = aP0[0];
      this.aP0 = aP0;
      pdyrp019.this.AV16BarReoI = aP1[0];
      this.aP1 = aP1;
      pdyrp019.this.AV17BarParI = aP2[0];
      this.aP2 = aP2;
      pdyrp019.this.AV18BarCodF = aP3[0];
      this.aP3 = aP3;
      pdyrp019.this.AV19BarReoF = aP4[0];
      this.aP4 = aP4;
      pdyrp019.this.AV20BarParF = aP5[0];
      this.aP5 = aP5;
      pdyrp019.this.AV21Sup = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22LI = GXutil.concat( GXutil.concat( GXutil.str( AV15BarCodI, 8, 0), GXutil.str( AV16BarReoI, 1, 0), ""), AV17BarParI, "") ;
      AV23LF = GXutil.concat( GXutil.concat( GXutil.str( AV18BarCodF, 8, 0), GXutil.str( AV19BarReoF, 1, 0), ""), AV20BarParF, "") ;
      if ( GXutil.strcmp(AV22LI, AV23LF) > 0 )
      {
         AV21Sup = httpContext.getMessage( "S", "") ;
      }
      else
      {
         AV21Sup = httpContext.getMessage( "F", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp019.this.AV15BarCodI;
      this.aP1[0] = pdyrp019.this.AV16BarReoI;
      this.aP2[0] = pdyrp019.this.AV17BarParI;
      this.aP3[0] = pdyrp019.this.AV18BarCodF;
      this.aP4[0] = pdyrp019.this.AV19BarReoF;
      this.aP5[0] = pdyrp019.this.AV20BarParF;
      this.aP6[0] = pdyrp019.this.AV21Sup;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22LI = "" ;
      AV23LF = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarReoI ;
   private byte AV19BarReoF ;
   private short Gx_err ;
   private int AV15BarCodI ;
   private int AV18BarCodF ;
   private String AV17BarParI ;
   private String AV20BarParF ;
   private String AV21Sup ;
   private String AV22LI ;
   private String AV23LF ;
   private String[] aP6 ;
   private int[] aP0 ;
   private byte[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
}

