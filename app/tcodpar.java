package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcodpar", "/app.tcodpar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodpar extends GXWebObjectStub
{
   public tcodpar( )
   {
   }

   public tcodpar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodpar.class ));
   }

   public tcodpar( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodpar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodpar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CODIGOS DE PARO";
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

