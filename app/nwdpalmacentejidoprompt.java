package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidoprompt", "/app.nwdpalmacentejidoprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidoprompt extends GXWebObjectStub
{
   public nwdpalmacentejidoprompt( )
   {
   }

   public nwdpalmacentejidoprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidoprompt.class ));
   }

   public nwdpalmacentejidoprompt( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidoprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidoprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Nw DPAlmacen Tejido";
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

