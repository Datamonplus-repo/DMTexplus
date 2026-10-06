package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoreoperadostipodefecto", "/app.historicoreoperadostipodefecto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoreoperadostipodefecto extends GXWebObjectStub
{
   public historicoreoperadostipodefecto( )
   {
   }

   public historicoreoperadostipodefecto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoreoperadostipodefecto.class ));
   }

   public historicoreoperadostipodefecto( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoreoperadostipodefecto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoreoperadostipodefecto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Reoperados Tipo Defecto";
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

