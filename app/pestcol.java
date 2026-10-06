package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestcol extends GXProcedure
{
   public pestcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestcol.class ), "" );
   }

   public pestcol( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            int[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 ,
                            byte[] aP7 ,
                            String[] aP8 )
   {
      pestcol.this.aP9 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 )
   {
      pestcol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestcol.this.AV20CliCod = aP1[0];
      this.aP1 = aP1;
      pestcol.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      pestcol.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      pestcol.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      pestcol.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      pestcol.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      pestcol.this.A2098MolCod = aP7[0];
      this.aP7 = aP7;
      pestcol.this.AV15EstCol = aP8[0];
      this.aP8 = aP8;
      pestcol.this.AV26Dg_valor = aP9[0];
      this.aP9 = aP9;
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
      this.aP0[0] = pestcol.this.A396EmprCod;
      this.aP1[0] = pestcol.this.AV20CliCod;
      this.aP2[0] = pestcol.this.A2141SerEst;
      this.aP3[0] = pestcol.this.A1013DibCli;
      this.aP4[0] = pestcol.this.A1014DibInt;
      this.aP5[0] = pestcol.this.A2074ColCom;
      this.aP6[0] = pestcol.this.A2078ColFon;
      this.aP7[0] = pestcol.this.A2098MolCod;
      this.aP8[0] = pestcol.this.AV15EstCol;
      this.aP9[0] = pestcol.this.AV26Dg_valor;
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

   private byte A2098MolCod ;
   private short AV26Dg_valor ;
   private short Gx_err ;
   private int AV20CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String AV15EstCol ;
   private short[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
}

