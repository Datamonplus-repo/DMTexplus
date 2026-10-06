package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoreoperadosresumentipodefecto", "/app.historicoreoperadosresumentipodefecto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoreoperadosresumentipodefecto extends GXWebObjectStub
{
   public historicoreoperadosresumentipodefecto( )
   {
   }

   public historicoreoperadosresumentipodefecto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoreoperadosresumentipodefecto.class ));
   }

   public historicoreoperadosresumentipodefecto( int remoteHandle ,
                                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoreoperadosresumentipodefecto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoreoperadosresumentipodefecto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Reoperados Resumen Tipo Defecto";
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

