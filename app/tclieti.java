package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclieti", "/app.tclieti"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclieti extends GXWebObjectStub
{
   public tclieti( )
   {
   }

   public tclieti( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclieti.class ));
   }

   public tclieti( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclieti_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclieti_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ETIQUETAS TIPO CLIENTE";
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

