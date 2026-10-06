package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcenttxt extends GXProcedure
{
   public pcenttxt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcenttxt.class ), "" );
   }

   public pcenttxt( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           byte[] aP1 ,
                           byte[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 )
   {
      pcenttxt.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pcenttxt.this.AV15VTEXT = aP0[0];
      this.aP0 = aP0;
      pcenttxt.this.AV16CENT = aP1[0];
      this.aP1 = aP1;
      pcenttxt.this.AV17DEC = aP2[0];
      this.aP2 = aP2;
      pcenttxt.this.AV18UNI = aP3[0];
      this.aP3 = aP3;
      pcenttxt.this.AV19GENERO = aP4[0];
      this.aP4 = aP4;
      pcenttxt.this.AV21EmpNumDec = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV16CENT < 0 )
      {
         AV16CENT = (byte)(-AV16CENT) ;
      }
      if ( AV17DEC < 0 )
      {
         AV17DEC = (byte)(-AV17DEC) ;
      }
      if ( AV18UNI < 0 )
      {
         AV18UNI = (byte)(-AV18UNI) ;
      }
      if ( AV16CENT > 0 )
      {
         if ( AV16CENT == 1 )
         {
            if ( ( AV17DEC == 0 ) && ( AV18UNI == 0 ) )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "CIEN", ""), " ") ;
            }
            else
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "CIENTO", ""), " ") ;
            }
         }
         if ( GXutil.strcmp(AV19GENERO, httpContext.getMessage( "M", "")) == 0 )
         {
            AV20CIENTOS = httpContext.getMessage( "IENTOS", "") ;
         }
         else
         {
            AV20CIENTOS = httpContext.getMessage( "IENTAS", "") ;
         }
         if ( AV16CENT == 2 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, AV20CIENTOS, httpContext.getMessage( " DOSC", "")) ;
         }
         if ( AV16CENT == 3 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, AV20CIENTOS, httpContext.getMessage( " TRESC", "")) ;
         }
         if ( AV16CENT == 4 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, AV20CIENTOS, httpContext.getMessage( " CUATROC", "")) ;
         }
         if ( AV16CENT == 5 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, AV20CIENTOS, httpContext.getMessage( " QUIN", "")) ;
         }
         if ( AV16CENT == 6 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, AV20CIENTOS, httpContext.getMessage( " SEISC", "")) ;
         }
         if ( AV16CENT == 7 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, AV20CIENTOS, httpContext.getMessage( " SETEC", "")) ;
         }
         if ( AV16CENT == 8 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, AV20CIENTOS, httpContext.getMessage( " OCHOC", "")) ;
         }
         if ( AV16CENT == 9 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, AV20CIENTOS, httpContext.getMessage( " NOVEC", "")) ;
         }
      }
      if ( AV17DEC > 2 )
      {
         if ( AV17DEC == 3 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "TREINTA", ""), " ") ;
         }
         if ( AV17DEC == 4 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "CUARENTA", ""), " ") ;
         }
         if ( AV17DEC == 5 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "CINCUENTA", ""), " ") ;
         }
         if ( AV17DEC == 6 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "SESENTA", ""), " ") ;
         }
         if ( AV17DEC == 7 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "SETENTA", ""), " ") ;
         }
         if ( AV17DEC == 8 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "OCHENTA", ""), " ") ;
         }
         if ( AV17DEC == 9 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "NOVENTA", ""), " ") ;
         }
         if ( AV18UNI == 1 )
         {
            if ( GXutil.strcmp(AV19GENERO, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( AV21EmpNumDec == 0 )
               {
                  AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y UNO", ""), " ") ;
               }
               else
               {
                  if ( AV21EmpNumDec == 2 )
                  {
                     AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y UN", ""), " ") ;
                  }
               }
            }
            else
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y UNA", ""), " ") ;
            }
         }
         if ( AV18UNI == 2 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y DOS", ""), " ") ;
         }
         if ( AV18UNI == 3 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y TRES", ""), " ") ;
         }
         if ( AV18UNI == 4 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y CUATRO", ""), " ") ;
         }
         if ( AV18UNI == 5 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y CINCO", ""), " ") ;
         }
         if ( AV18UNI == 6 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y SEIS", ""), " ") ;
         }
         if ( AV18UNI == 7 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y SIETE", ""), " ") ;
         }
         if ( AV18UNI == 8 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y OCHO", ""), " ") ;
         }
         if ( AV18UNI == 9 )
         {
            AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "Y NUEVE", ""), " ") ;
         }
      }
      else
      {
         if ( AV17DEC == 2 )
         {
            if ( AV18UNI == 0 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTE", ""), " ") ;
            }
            if ( AV18UNI == 1 )
            {
               if ( GXutil.strcmp(AV19GENERO, httpContext.getMessage( "M", "")) == 0 )
               {
                  AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTIUNO", ""), " ") ;
               }
               else
               {
                  AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTIUNA", ""), " ") ;
               }
            }
            if ( AV18UNI == 2 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTIDOS", ""), " ") ;
            }
            if ( AV18UNI == 3 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTITRES", ""), " ") ;
            }
            if ( AV18UNI == 4 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTICUATRO", ""), " ") ;
            }
            if ( AV18UNI == 5 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTICINCO", ""), " ") ;
            }
            if ( AV18UNI == 6 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTISEIS", ""), " ") ;
            }
            if ( AV18UNI == 7 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTISIETE", ""), " ") ;
            }
            if ( AV18UNI == 8 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTIOCHO", ""), " ") ;
            }
            if ( AV18UNI == 9 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "VEINTINUEVE", ""), " ") ;
            }
         }
         if ( AV17DEC == 1 )
         {
            if ( AV18UNI == 0 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "DIEZ", ""), " ") ;
            }
            if ( AV18UNI == 1 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "ONCE", ""), " ") ;
            }
            if ( AV18UNI == 2 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "DOCE", ""), " ") ;
            }
            if ( AV18UNI == 3 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "TRECE", ""), " ") ;
            }
            if ( AV18UNI == 4 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "CATORCE", ""), " ") ;
            }
            if ( AV18UNI == 5 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "QUINCE", ""), " ") ;
            }
            if ( AV18UNI == 6 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "DIECISEIS", ""), " ") ;
            }
            if ( AV18UNI == 7 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "DIECISIETE", ""), " ") ;
            }
            if ( AV18UNI == 8 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "DIECIOCHO", ""), " ") ;
            }
            if ( AV18UNI == 9 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "DIECINUEVE", ""), " ") ;
            }
         }
         if ( AV17DEC == 0 )
         {
            if ( AV18UNI == 1 )
            {
               if ( GXutil.strcmp(AV19GENERO, httpContext.getMessage( "M", "")) == 0 )
               {
                  if ( AV21EmpNumDec == 2 )
                  {
                     AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "UNO", ""), " ") ;
                  }
                  else
                  {
                     if ( AV21EmpNumDec == 0 )
                     {
                        AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "UN", ""), " ") ;
                     }
                  }
               }
               else
               {
                  AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "UNA", ""), " ") ;
               }
            }
            if ( AV18UNI == 2 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "DOS", ""), " ") ;
            }
            if ( AV18UNI == 3 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "TRES", ""), " ") ;
            }
            if ( AV18UNI == 4 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "CUATRO", ""), " ") ;
            }
            if ( AV18UNI == 5 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "CINCO", ""), " ") ;
            }
            if ( AV18UNI == 6 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "SEIS", ""), " ") ;
            }
            if ( AV18UNI == 7 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "SIETE", ""), " ") ;
            }
            if ( AV18UNI == 8 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "OCHO", ""), " ") ;
            }
            if ( AV18UNI == 9 )
            {
               AV15VTEXT = GXutil.concat( AV15VTEXT, httpContext.getMessage( "NUEVE", ""), " ") ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcenttxt.this.AV15VTEXT;
      this.aP1[0] = pcenttxt.this.AV16CENT;
      this.aP2[0] = pcenttxt.this.AV17DEC;
      this.aP3[0] = pcenttxt.this.AV18UNI;
      this.aP4[0] = pcenttxt.this.AV19GENERO;
      this.aP5[0] = pcenttxt.this.AV21EmpNumDec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20CIENTOS = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16CENT ;
   private byte AV17DEC ;
   private byte AV18UNI ;
   private byte AV21EmpNumDec ;
   private short Gx_err ;
   private String AV15VTEXT ;
   private String AV19GENERO ;
   private String AV20CIENTOS ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private byte[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
}

