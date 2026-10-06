package app.ponteway ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_checklistimport extends GXProcedure
{
   public get_checklistimport( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_checklistimport.class ), "" );
   }

   public get_checklistimport( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> aP0 )
   {
      get_checklistimport.this.aP1 = new boolean[] {false};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> aP0 ,
                        boolean[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> aP0 ,
                             boolean[] aP1 )
   {
      get_checklistimport.this.AV8GuiaRemessaLinhaItemDTO = aP0;
      get_checklistimport.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13GXV1 = 1 ;
      while ( AV13GXV1 <= AV8GuiaRemessaLinhaItemDTO.size() )
      {
         AV10GuiaRemessaLinhaItemDTO_Item = (app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)((app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas)AV8GuiaRemessaLinhaItemDTO.elementAt(-1+AV13GXV1));
         if ( AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Selected() )
         {
            if ( (GXutil.strcmp("", AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Unidade())==0) || (0==AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Rolos()) || (GXutil.strcmp("", AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Reclamacion())==0) || (GXutil.strcmp("", AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Lote())==0) || (GXutil.strcmp("", AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Jogo())==0) || (GXutil.strcmp("", AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Polegadas())==0) || (GXutil.strcmp("", AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Fio())==0) || (GXutil.strcmp("", AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Maquina())==0) || (0==AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Quantidade()) || (0==AV10GuiaRemessaLinhaItemDTO_Item.getgxTv_SdtGuiaRemessaLinhaItemDTO_linhas_Referencia()) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Los campos unidad, reclamación, lote, rollos, juego, hilo, pulgadas, máquina, cantidad y referencia no pueden estar vacíos.", ""));
               AV9isOk = false ;
            }
            else
            {
               AV9isOk = true ;
            }
         }
         AV13GXV1 = (int)(AV13GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = get_checklistimport.this.AV9isOk;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10GuiaRemessaLinhaItemDTO_Item = new app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13GXV1 ;
   private boolean AV9isOk ;
   private boolean[] aP1 ;
   private GXBaseCollection<app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas> AV8GuiaRemessaLinhaItemDTO ;
   private app.ponteway.v1.SdtGuiaRemessaLinhaItemDTO_linhas AV10GuiaRemessaLinhaItemDTO_Item ;
}

