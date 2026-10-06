package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxmaqp", "/app.tvxmaqp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxmaqp extends GXWebObjectStub
{
   public tvxmaqp( )
   {
   }

   public tvxmaqp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxmaqp.class ));
   }

   public tvxmaqp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxmaqp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxmaqp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla Grupos de Máquinas - Propiedades";
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

