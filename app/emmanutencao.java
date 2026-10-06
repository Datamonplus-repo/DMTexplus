package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.emmanutencao", "/app.emmanutencao"})
@jakarta.servlet.annotation.MultipartConfig
public final  class emmanutencao extends GXWebObjectStub
{
   public emmanutencao( )
   {
   }

   public emmanutencao( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( emmanutencao.class ));
   }

   public emmanutencao( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new emmanutencao_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new emmanutencao_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Em Manutencao";
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

