package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxmaqg", "/app.tvxmaqg"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxmaqg extends GXWebObjectStub
{
   public tvxmaqg( )
   {
   }

   public tvxmaqg( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxmaqg.class ));
   }

   public tvxmaqg( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxmaqg_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxmaqg_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Grupo de Máquinas";
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

