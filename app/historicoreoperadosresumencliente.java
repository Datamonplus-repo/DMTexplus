package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoreoperadosresumencliente", "/app.historicoreoperadosresumencliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoreoperadosresumencliente extends GXWebObjectStub
{
   public historicoreoperadosresumencliente( )
   {
   }

   public historicoreoperadosresumencliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoreoperadosresumencliente.class ));
   }

   public historicoreoperadosresumencliente( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoreoperadosresumencliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoreoperadosresumencliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Reoperados Resumen Cliente";
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

