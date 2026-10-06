package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tshasep", "/app.tshasep"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tshasep extends GXWebObjectStub
{
   public tshasep( )
   {
   }

   public tshasep( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tshasep.class ));
   }

   public tshasep( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tshasep_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tshasep_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden de Separación de Colores";
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

