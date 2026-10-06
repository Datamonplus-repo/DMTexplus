package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.apcolhdrhistorico", "/app.formulaciontinte.apcolhdrhistorico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class apcolhdrhistorico extends GXWebObjectStub
{
   public apcolhdrhistorico( )
   {
   }

   public apcolhdrhistorico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( apcolhdrhistorico.class ));
   }

   public apcolhdrhistorico( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new apcolhdrhistorico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new apcolhdrhistorico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de HDRS en Historico";
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

