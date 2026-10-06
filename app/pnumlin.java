package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumlin extends GXProcedure
{
   public pnumlin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumlin.class ), "" );
   }

   public pnumlin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( long aP0 ,
                           short aP1 ,
                           short aP2 ,
                           long aP3 )
   {
      pnumlin.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( long aP0 ,
                        short aP1 ,
                        short aP2 ,
                        long aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             short aP1 ,
                             short aP2 ,
                             long aP3 ,
                             long[] aP4 )
   {
      pnumlin.this.AV29ValorMaximo = aP0;
      pnumlin.this.AV28Incremento = aP1;
      pnumlin.this.AV26Largo = aP2;
      pnumlin.this.AV30Linea = aP3;
      pnumlin.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Numerador = AV30Linea ;
      if ( ( AV28Incremento > 0 ) && ( AV26Largo > 0 ) )
      {
         if ( (0==AV25Numerador) || ( AV25Numerador < AV29ValorMaximo + AV28Incremento ) )
         {
            AV25Numerador = (long)(AV29ValorMaximo+AV28Incremento) ;
            if ( AV28Incremento > 1 )
            {
               AV25Numerador = (long)(AV25Numerador-(((int)((AV29ValorMaximo) % (AV28Incremento))))) ;
            }
         }
         AV27Tope = (long)(java.lang.Math.pow(10,AV26Largo)) ;
         if ( AV25Numerador >= AV27Tope )
         {
            AV25Numerador = (long)(AV27Tope-1) ;
         }
      }
      System.out.println( "Retorna Línea "+GXutil.trim( GXutil.str( AV25Numerador, 18, 0)) );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pnumlin.this.AV25Numerador;
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

   private short AV28Incremento ;
   private short AV26Largo ;
   private short Gx_err ;
   private long AV29ValorMaximo ;
   private long AV30Linea ;
   private long AV25Numerador ;
   private long AV27Tope ;
   private long[] aP4 ;
}

