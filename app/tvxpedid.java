package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxpedid", "/app.tvxpedid"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxpedid extends GXWebObjectStub
{
   public tvxpedid( )
   {
   }

   public tvxpedid( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxpedid.class ));
   }

   public tvxpedid( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxpedid_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxpedid_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla VERTEX.PEDID y PEDLIN";
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

