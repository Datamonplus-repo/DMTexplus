package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rmorden extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rmorden pgm = new rmorden (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      String[] aP2 = new String[] {""};
      short[] aP3 = new short[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (String) args[2];
         aP3[0] = (short) GXutil.lval( args[3]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public rmorden( )
   {
      super( -1 , new ModelContext( rmorden.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rmorden( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rmorden.class ), "" );
   }

   public rmorden( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 )
   {
      short[] aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      rmorden.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      rmorden.this.AV3OMCodCollectionJSon = aP1[0];
      this.aP1 = aP1;
      rmorden.this.AV4Tipo = aP2[0];
      this.aP2 = aP2;
      rmorden.this.AV5Tot = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = rmorden.this.AV2EmprCod;
      this.aP1[0] = rmorden.this.AV3OMCodCollectionJSon;
      this.aP2[0] = rmorden.this.AV4Tipo;
      this.aP3[0] = rmorden.this.AV5Tot;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
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

   private short AV5Tot ;
   private short Gx_err ;
   private String AV2EmprCod ;
   private String AV4Tipo ;
   private String AV3OMCodCollectionJSon ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
}

