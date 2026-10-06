package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tfrasr", "/app.stocksquimicos.tfrasr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfrasr extends GXWebObjectStub
{
   public tfrasr( )
   {
   }

   public tfrasr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfrasr.class ));
   }

   public tfrasr( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfrasr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfrasr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipos Frases Riesgo";
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

