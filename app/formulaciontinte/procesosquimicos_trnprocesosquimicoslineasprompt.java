package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.procesosquimicos_trnprocesosquimicoslineasprompt", "/app.formulaciontinte.procesosquimicos_trnprocesosquimicoslineasprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class procesosquimicos_trnprocesosquimicoslineasprompt extends GXWebObjectStub
{
   public procesosquimicos_trnprocesosquimicoslineasprompt( )
   {
   }

   public procesosquimicos_trnprocesosquimicoslineasprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( procesosquimicos_trnprocesosquimicoslineasprompt.class ));
   }

   public procesosquimicos_trnprocesosquimicoslineasprompt( int remoteHandle ,
                                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new procesosquimicos_trnprocesosquimicoslineasprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new procesosquimicos_trnprocesosquimicoslineasprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Procesos Quimicos Lineas";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

