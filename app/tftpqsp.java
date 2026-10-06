package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tftpqsp", "/app.tftpqsp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tftpqsp extends GXWebObjectStub
{
   public tftpqsp( )
   {
   }

   public tftpqsp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tftpqsp.class ));
   }

   public tftpqsp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tftpqsp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tftpqsp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FICHA TECNICA PQ, PROGRAMAS";
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

