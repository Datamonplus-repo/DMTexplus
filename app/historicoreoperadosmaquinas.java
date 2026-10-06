package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoreoperadosmaquinas", "/app.historicoreoperadosmaquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoreoperadosmaquinas extends GXWebObjectStub
{
   public historicoreoperadosmaquinas( )
   {
   }

   public historicoreoperadosmaquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoreoperadosmaquinas.class ));
   }

   public historicoreoperadosmaquinas( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoreoperadosmaquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoreoperadosmaquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Reoperados Maquinas";
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

